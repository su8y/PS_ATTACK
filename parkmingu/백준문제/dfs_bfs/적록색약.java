package parkmingu.백준문제.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 적록색약 {
    // 해결 X
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[][] rgb = new String[n][n];

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));// reader선언
        StringTokenizer st;// tokenizer 선언

        for (int i = 0; i < rgb.length; i++) {
            st = new StringTokenizer(bf.readLine());
            String st2 = st.nextToken();

            for (int j = 0; j < rgb[i].length; j++) {
                // rgb[i][j] = st2.charAt(j);
            }
        }

        for (int i = 0; i < rgb.length; i++) {
            for (int j = 0; j < rgb[i].length; j++) {
                System.out.print(rgb[i][j] + " ");
            }
            System.out.println();
        }

        // System.out.print(red_green_medicine(rgb) + " ");
        // System.out.print(not_red_green_medicine(rgb));
    }

    public static int red_green_medicine(String[][] rgb) {

        return 0;
    }

    public static int not_red_green_medicine(String[][] rgb) {

        return 0;
    }
}
