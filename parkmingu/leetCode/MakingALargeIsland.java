package parkmingu.leetCode;

import java.util.Scanner;

public class MakingALargeIsland {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] input = new int[500][500];

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                input[i][j] = sc.nextInt();
            }
        }

        largestIsland(input);
    }

    // 각각의 네트워크의 크기를 구한다
    // 상하좌우로 정확히 한칸 떨어져있는 네트워크중에서 제일큰 네트워크를 구한다
    // 두 네트워크를 합쳐서 값을 구한다

    public static int largestIsland(int[][] grid) {
        int tmp = 0;
        int answer;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    grid[i][j]++;
                    System.out.print(grid[i][j] + " ");
                } else {
                    System.out.print(grid[i][j] + " ");
                }
            }
        }

        return 0;
    }
}