import java.util.Scanner;

public class Main {
    static int[][] arr = new int[501][501];
    static int[][] dp = new int[501][501];
    static int[] moveX = {1, -1, 0, 0}; // 동서남북
    static int[] moveY = {0, 0, -1, 1}; // 동서남북
    static int N = 0;
    static int res = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                arr[i][j] = sc.nextInt();

        int res = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                res = Math.max(dfs(i,j), res);
            }
        }
        System.out.println(res);

    }

    static int dfs(int x, int y) {
        if(dp[x][y] != 0) return dp[x][y];

        dp[x][y] = 1;

        for (int i = 0; i < 4; i++) {
            int mx = x + moveX[i];
            int my = y + moveY[i];
            if (mx >= 0 && mx < N && my >= 0 && my < N) {   // 동서남북 이동시 범위를 벗어나면 안됨
                if(arr[mx][my] > arr[x][y]) {   // 이동할 칸이 현재 칸보다 값이 크면
                    int next = dfs(mx,my);      // 바로 dfs 해버리기, 변수에 값 저장
                    dp[x][y] = Math.max(dp[x][y], next+1);  // 원래 있던 값이 큰지, dfs로 가져온 값이 큰지 골라 저장
                }
            }
        }
        return dp[x][y];
    }

}
