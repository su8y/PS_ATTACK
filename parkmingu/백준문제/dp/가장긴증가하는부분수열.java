package parkmingu.백준문제.dp;

import java.util.Scanner;

public class 가장긴증가하는부분수열 {
    /*
     * 20
     * 31 84 18 62 35 77 23 53 60 94 3 77 60 51 42 18 83 85 63 51
     * ans 7
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            // 수열의 최소값은 1
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (a[j] < a[i] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        // 최댓값(최대 길이) 탐색
        int max = -1;
        for (int i = 0; i < n; i++) {
            max = dp[i] > max ? dp[i] : max;
        }
        System.out.print(max);
    }
}
