package parkmingu.백준문제.bruteForce;

import java.util.Arrays;
import java.util.Scanner;

public class 일곱난쟁이 {
    static boolean check = false;

    public static void main(String[] args) {
        // 9개의 숫자들중 7개 숫자의 합이 100이 되는 7개의 숫자를 오름차순 출력하라
        // 9개중 7개씩만 검사해야함
        // 조합 문제

        Scanner sc = new Scanner(System.in);

        int[] init = new int[9];
        boolean[] visited = new boolean[9];

        for (int i = 0; i < init.length; i++) {
            init[i] = sc.nextInt();
        }

        // 9C7함
        combination(init, visited, 0, 9, 7);

    }

    // 백트래킹 사용
    // 사용 예시 : combination(arr, visited, 0, n, r)
    static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
        if (r == 0) {
            print(arr, visited, n);
            return;
        }

        for (int i = start; i < n; i++) {
            // 이미 답을 구했으면 break
            if (check == true) {
                break;
            }
            // System.out.print("전진");
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1);
            // System.out.print("후퇴");
            visited[i] = false;
        }
    }

    // 배열 출력
    static void print(int[] arr, boolean[] visited, int n) {
        int tmp = 0;
        int[] answer_2 = new int[7];
        int add = 0;

        // visited로 출력할 거 판별
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                System.out.print(arr[i] + " ");
                // tmp += arr[i];
                // answer_2[add++] = arr[i];
            }
        }
        System.out.println();

        Arrays.sort(answer_2);

        if (tmp == 100) {
            for (int i = 0; i < answer_2.length; i++) {
                System.out.println(answer_2[i]);
            }
            check = true;
        }
    }

}
