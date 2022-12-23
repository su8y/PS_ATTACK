package korsua.graph.bfs;

public class MakingALargeIsland {
    final static int[] dx = {1, 0, -1, 0};
    final static int[] dy = {0, -1, 0, 1};
    private static int vLength;
    private static int hLength;
    private static int[][] check;
    private static int[][] request = {
            {0, 1, 1, 0, 1, 1},
            {0, 0, 1, 0, 1, 1},
            {1, 1, 0, 0, 0, 0}

    };

    public static void main(String[] args) {
        int result = largestIsland(request);
    }

    private static int largestIsland(int[][] request) {
        vLength = request.length;
        hLength = request[0].length;
        check = new int[vLength][hLength];

        int res = 0;
        int cnt = 0;
        for (int y = 0; y < vLength; y++) {
            for (int x = 0; x < hLength; x++) {
                if (isMapOne(y, x) && isCheck(y, x)) {
                    cnt++;
                    dfs(y, x, 1);
                }
            }
        }

        for (int i = 0; i < vLength; i++) {
            for (int j = 0; j < hLength; j++) {
                System.out.printf("%d ", check[i][j]);
            }
            System.out.println();
        }
        int max = 0;
        for(int y = 0 ; y < vLength; y++){
            for (int x = 0; x < hLength; x++){
                if(isMapOne(y,x) == false){
                    int tarsum = 1;
                    for(int z = 0 ; z < 4 ; z++){
                        int nextY = y + dy[z];
                        int nextX = x + dx[z];
                        if(outOfRange(nextY,nextX) && isCheck(nextY,nextY) ){
                            tarsum += check[nextY][nextX];
                        }
                    }
                    max = Math.max(max,tarsum);
                }
            }
        }
        System.out.println(max);


        return res;
    }

    private static int dfs(int y, int x, int count) {
        int res = 0;
        check[y][x] = count;
        for (int i = 0; i < 4; i++) {
            int nextY = dy[i] + y;
            int nextX = dx[i] + x;
            if (outOfRange(nextY, nextX) && isMapOne(nextY, nextX) && isCheck(nextY, nextX)) {
                check[y][x] = dfs(nextY, nextX, count + 1);
            }
        }
        return Math.max(check[y][x], count);
    }

    public static boolean isCheck(int y, int x) {
        if (check[y][x] == 0) return true;
        return false;
    }

    public static boolean isMapOne(int y, int x) {
        if (request[y][x] == 1) return true;
        return false;
    }

    public static boolean outOfRange(int y, int x) {
        if ((y < 0 || y >= vLength) || (x < 0 || x >= hLength)) return false;
        return true;
    }
}
