package parkmingu.백준문제.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LCS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str1 = br.readLine().toCharArray();
        char[] str2 = br.readLine().toCharArray();

        int length_1 = str1.length;
        int length_2 = str2.length;

        // 공집합 표현을위해 인덱스를 한칸씩 추가함(0번째칸에 0)
        int[][] dp = new int[length_1 + 1][length_2 + 1];

        for (int i = 1; i <= length_1; i++) {
            for (int j = 1; j <= length_2; j++) {
                if (str1[i - 1] == str2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        System.out.println(dp[length_1][length_2]);

    }
}
