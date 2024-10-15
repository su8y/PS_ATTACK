/*
 * 문제 : 백준 2098번 - 외판원 순회 (https://www.acmicpc.net/problem/2098)
 * 문제 풀이
 * 	완전탐색으로 생각할 경우 시간복잡도가 O(n!)이기 때문에 dp를 이용하여 시간복잡도를 줄임
 * 	예를 들어 도시 0,1,2,3,4,5가 있다고 가정했을 때
 * 	0->1->2->3->4->5->0이 최소 비용 경로라는 것을 알고 있으면
 * 	0->2->1->3 상황에서는 위의 경로를 통해 4->5->0이 비용이 가장 적게 든다는 것을 알기 때문에
 * 	0->2->1->3->4->5->0이 최소 비용이라는 것을 알 수 있음
 * 	이 알고리즘을 적용하려면 남은 도시에 따른 최소 비용을 배열에 저장해야 함
 * 	n(도시의 수)이 커지면 배열 크기 문제로 사용할 수 없지만 이 문제는 n이 최대 16이여서 괜찮음
 * 	n이 최대 16이기 때문에 배열 대신 비트 마스크를 사용하면 int형 변수로 표현할 수 있음
 */

package Baekjoon;

import java.io.*;
import java.util.stream.Stream;

public class BOJ_2098_외판원순회 {
    // public class Main {
    static int n;
    static int w[][];
    static int dp[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        w = new int[n][n];
        dp = new int[n][1 << n];

        for (int i = 0; i < n; i++)
            w[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        bw.write(Integer.toString(tsp(0, 1)));
        bw.flush();

        br.close();
        bw.close();
    }

    public static int tsp(int c, int v) { // c : 현재 방문한 도시, v : 여태까지 방문했던 도시들을 2진수로 표현
        if (v == (1 << n) - 1) // 모든 도시를 방문했을 경우
            return w[c][0] == 0 ? -1 : w[c][0]; // 현재 도시에서 시작 도시로의 길이 없으면 -1, 있으면 경로 비용 반환

        if (dp[c][v] != 0) // 이미 방문한 도시인 경우
            return dp[c][v];

        for (int i = 0; i < n; i++) {
            if ((v & 1 << i) == 0 && w[c][i] != 0) { // 방문하지 않은 도시이고, 갈 수 있는 도시인 경우
                int nextCity = tsp(i, (v | 1 << i));

                if (nextCity == -1) // 다음 도시에서 갈 수 있는 길이 없는 경우
                    continue;
                else if (dp[c][v] == 0) // dp에 저장된 최소 비용이 없을 경우
                    dp[c][v] = nextCity + w[c][i];
                else if (dp[c][v] > 0) // dp에 저장된 값이 있지만 최소 비용인지는 모르기에 비교해서 최소 비용 저장
                    dp[c][v] = Math.min(dp[c][v], nextCity + w[c][i]);
            }
        }

        if (dp[c][v] == 0) // for문을 돌았는데 dp에 아무 값도 저장되어 있는 않은 경우는 순회 루트에 갈 수 없는 도시가 있다는 뜻
            dp[c][v] = -1;

        return dp[c][v];
    }
}
