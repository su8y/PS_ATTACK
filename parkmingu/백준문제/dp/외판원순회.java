package parkmingu.백준문제.dp;

import java.util.Scanner;

public class 외판원순회 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = 0;
        int min = 0;
        int[][] w = new int[n][n];
        int[] dp = new int[n];
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            min = 2000001;
            for (int j = 0; j < n; j++) {
                w[i][j] = sc.nextInt();
                // 시작 + 끝 이 가장 작은 값을 시작지점으로 선택
                if (i == 0 && w[i][j] != 0 && min > (w[i][j] + w[n - 1][j])) {
                    min = w[i][j];
                    dp[0] = min;
                    visited[j] = true;
                    start = j;
                }
            }
        }

        // 0은 지정했으니 1부터 시작
        for (int i = 1; i < n; i++) {
            min = 1000001;
            for (int j = 0; j < n; j++) {
                if (visited[j] == false && w[i][j] != 0 && w[i][j] < min) {
                    min = w[i][j];
                    dp[i] = min;
                    visited[j] = true;
                }
            }
            dp[i] = dp[i - 1] + dp[i];
        }

        System.out.println(dp[n]);
    }
}
