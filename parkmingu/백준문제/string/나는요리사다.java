package parkmingu.백준문제.string;

import java.util.Scanner;

public class 나는요리사다 {
    public static void main(String[] args) {
        int[][] cookScore = new int[5][4];
        int max = 0, newMax = 0;
        int bestCook = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < cookScore.length; i++) {
            // newMax는 사용후 초기화
            newMax = 0;
            for (int j = 0; j < cookScore[i].length; j++) {
                cookScore[i][j] = sc.nextInt();
                newMax += cookScore[i][j];
            }
            if (newMax > max) {
                bestCook = i + 1;
                max = newMax;
            }
        }

        System.out.print(bestCook + " " + max);
    }
}
