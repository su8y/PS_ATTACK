package parkmingu.백준문제.dp;

import java.util.Scanner;

public class 계단오르기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] n = new int[t + 1];
        int[] dp = new int[t + 1];

        for (int i = 1; i <= t; i++) {
            n[i] = sc.nextInt();
        }

        dp[1] = n[1];

        // t가 1인경우
        if (t >= 2) {
            dp[2] = n[1] + n[2];
        }

        for (int i = 3; i <= t; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + n[i - 1]) + n[i];
        }

        System.out.println(dp[t]);

    }
}
