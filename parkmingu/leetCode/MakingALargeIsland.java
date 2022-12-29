package parkmingu.leetCode;

import java.util.Scanner;

public class MakingALargeIsland {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] input = new int[2][2];

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                input[i][j] = sc.nextInt();
            }
        }

        largestIsland(input);
    }

    public static int largestIsland(int[][] grid) {
        int tmp = 0;
        int answer;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    tmp++;
                }
            }
        }

        if (tmp == 0) {
            answer = 1;
        } else if (tmp == 1) {
            answer = 2;
        } else if (tmp == 2) {
            answer = 3;
        } else {
            answer = 4;
        }

        return answer;
    }
}