package parkmingu.백준문제.dp;

import java.util.Scanner;

public class 타일링 {
    // 간단하게 그려보면 나오는 점화식 문제
    // 무언가 순서나 규칙이 있는거 같으면 한번 간단하게 그려보기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
        }
        System.out.println(dp[n]);
    }
}
