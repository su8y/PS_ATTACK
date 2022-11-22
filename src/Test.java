import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Test {
    static int Y_LEN;
    static int X_LEN;
    final static int[] d_x = {-1,0,1,0};
    final static int[] d_y = {0,1,0,-1};
    static boolean[][] visitedY;
    static boolean[][] visitedX;


    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        Y_LEN = heights.length;
        X_LEN = heights[0].length;
        List<List<Integer>> list = new ArrayList<>();
        for(int y = 0 ; y < Y_LEN; y++){
            for(int x = 0 ; x< X_LEN; x++){
                if(dfsAll(x,y,heights) == true){
                    List<Integer> correct = new ArrayList<>();
                    correct.addAll(Arrays.asList(y,x));
                    list.add(correct);
                }
            }
        }
        return list;
    }


    private boolean dfsAll(int x, int y,int arr[][]) {
        visitedX = new boolean[Y_LEN][X_LEN];
        visitedY = new boolean[Y_LEN][X_LEN];
        return dfsx(x,y,arr) && dfsy(x,y,arr);
    }

    private boolean dfsy(int x, int y,int arr[][]) {
        boolean isArrive = false;
        visitedY[y][x] = true;
        if(x >= X_LEN -1 || y >= Y_LEN -1) return true;
        for(int i = 0 ; i< 4; i++){
            if(isArrive) return true;
            int therex = x + d_x[i];
            int therey = y + d_y[i];
            if((therex <X_LEN && therex >= 0) && (therey < Y_LEN && therey >= 0))
            {
                if(visitedY[therey][therex] == false&& arr[y][x] >= arr[therey][therex]){
                    isArrive = dfsy(therex, therey,arr);
                }
            }
        }
        return isArrive;
    }

    private boolean dfsx(int x, int y,int arr[][]) {
        boolean isArrive = false;
        visitedX[y][x] = true;
        if(x == 0 || y == 0) return true;

        for(int i = 0 ; i< 4; i++){
            if(isArrive) return true;
            int therex = x + d_x[i];
            int therey = y + d_y[i];
            if((therex <X_LEN && therex >= 0) && (therey < Y_LEN && therey >= 0))
            {
                if(visitedX[therey][therex] == false && arr[y][x] >= arr[therey][therex])
                {
                    isArrive = dfsx(therex, therey,arr);

                }
            }
        }
        return isArrive;
    }

    public static void main(String[] args) {
        int[][] arr= {{1,1,3},{1,3,1},{3,1,1}};
        new Test().pacificAtlantic(arr);
    }

}