package parkmingu.백준문제.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 
1
5
1 5
2 4
3 3
4 2
5 1
 */
/*
 * 시간 초과가 남 반복문을 줄이는 로직을 생각해보기
 * 처음에 해쉬맵을 썻다가 틀림 이유는 아직 모름
 * 배열로 변경 후 성공함
 */
public class 신입사원 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int ans = n;
            // 인덱스를 서류순위 값을 면접순위로 설정
            int[] score = new int[n + 1];

            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                // 10의자리
                score[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
            }

            int num = score[1];

            for (int j = 2; j <= n; j++) {
                if (num <= score[j]) {
                    ans--;
                } else {
                    num = score[j];
                }
            }

            System.out.println(ans);
        }
    }
}
