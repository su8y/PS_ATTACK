package parkmingu.백준문제.greedy;

import java.util.Scanner;

public class 거스름돈 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = 1000 - sc.nextInt();
        int answer = 0;

        while (input != 0) {
            if (input >= 500) {
                input -= 500;
                answer++;
                continue;
            } else if (input >= 100) {
                input -= 100;
                answer++;
                continue;
            } else if (input >= 50) {
                input -= 50;
                answer++;
                continue;
            } else if (input >= 10) {
                input -= 10;
                answer++;
                continue;
            } else if (input >= 5) {
                input -= 5;
                answer++;
                continue;
            } else {
                input -= 1;
                answer++;
                continue;
            }
        }
        System.out.print(answer);
    }
}
