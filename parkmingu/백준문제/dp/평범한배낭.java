package parkmingu.백준문제.dp;

import java.util.Scanner;

public class 평범한배낭 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        // dp w v 전부 1부터 시작해서 크기를 맞춤
        int[][] dp = new int[N + 1][K + 1];
        int[] W = new int[N + 1];
        int[] V = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            W[i] = sc.nextInt();
            V[i] = sc.nextInt();
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= K; j++) {
                // 이전 값 대입
                dp[i][j] = dp[i - 1][j];
                // i = 2, j = 5
                // 현재 무게에서 w[i]의 무게가 >=0 이면 가치를 비교후 큰값을 대입
                if (j - W[i] >= 0)
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - W[i]] + V[i]);
            }
        }

        System.out.println(dp[N][K]);
    }
}
