package parkmingu.백준문제.string;

import java.util.Scanner;

public class 문자열반복 {
    public static void main(String[] args) {
        // 테스트 케이스t 설정, R 반복 횟수, s 문자열 입력후 각 문자열을 파싱후 R번 반복하고 출력
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        // n^3나옴 안좋음
        for (int i = 0; i < t; i++) {
            int r = sc.nextInt();
            String[] s = sc.next().split("");
            // A B C

            for (int j = 0; j < s.length; j++) {
                for (int k = 0; k < r; k++) {
                    System.out.print(s[j]);
                }
            }

            System.out.println();
        }

    }
}
