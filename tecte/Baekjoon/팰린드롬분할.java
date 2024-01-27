/*
 * 문 제 : 백준 1509번 - 팰린드롬 분할 (https://www.acmicpc.net/problem/1509)
 * 문제 풀이
 *  문자열 중 어느 부분이 팰린드롬인지 확인. checkPalindrome[i][j]는 i부터 j까지 팰린드롬이라는 의미.
 *  i~j의 중간에서부터 팰린드롬인지 k번 검사(k는 중간에서부터 j까지의 거리). 팰린드롬이면 checkPalindrome[i+k][j-k]를 true로 변환.
 *  i~j 중 팰린드롬의 최소 개수를 dp[i]에 저장.
 */

package Baekjoon;

import java.io.*;

// public class  Main {
public class 팰린드롬분할 {
    static String[] str;
    static boolean[][] checkPalindrome; // 팰린드롬인지 확인하는 배열
    static int[] dp; // 팰린드롬의 최소 개수를 저장하는 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        str = br.readLine().split("");
        checkPalindrome = new boolean[str.length][str.length];
        dp = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            for (int j = i; j < str.length; j++) {
                if (checkPalindrome[i][j]) // 이미 팰린드롬인지 확인 했으므로 continue
                    continue;

                // i~j 중간에서부터 팰린드롬인지 k번 확인(k는 중간에서부터 j까지의 거리)
                for (int k = (j - i) / 2; k >= 0; k--) {
                    if (str[i + k].equals(str[j - k]))
                        checkPalindrome[i + k][j - k] = true;
                    else
                        break;
                }
            }
        }

        bw.write(Integer.toString(palindrome(0)));
        bw.flush();

        br.close();
        bw.close();
    }

    public static int palindrome(int i) {
        if (i == str.length) {
            return 0;
        } else if (dp[i] == 0) {
            dp[i] = Integer.MAX_VALUE;

            // 문자열의 i 번째부터 끝까지의 팰린드롬 최소 개수를 dp[i]에 저장
            for (int j = i; j < str.length; j++)
                if (checkPalindrome[i][j])
                    dp[i] = Math.min(dp[i], palindrome(j + 1) + 1);
        }

        return dp[i];
    }
}
