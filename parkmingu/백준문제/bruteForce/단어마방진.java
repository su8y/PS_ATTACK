package parkmingu.백준문제.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 단어마방진 {
    // 해결 X
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int l = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        String[][] word = new String[l][n];
        String[] tmp;
        String check1;
        String check2;

        Boolean wordChcek;

        String[][] ans = new String[l][l];

        for (int i = 0; i < l; i++) {
            tmp = br.readLine().split("");
            for (int j = 0; j < n; j++) {
                word[i][j] = tmp[j];
            }
        }

        for (int i = 0; i < l - n; i++) {
            for (int j = 0; j < n; j++) {
                check1 = "";
                check2 = "";
                for (int k = 0; k < n; k++) {
                    // 가로
                    check1 += word[j + i][k];
                    // 세로
                    check2 += word[k + i][j];
                }
                if (check1.equals(check2)) {
                    wordChcek = true;
                } else {
                    wordChcek = false;
                    break;
                }
            }
        }

        System.out.println();
    }
}
