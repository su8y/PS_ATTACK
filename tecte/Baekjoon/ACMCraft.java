/*
 * 문 제 : 백준 1005번 - ACM Craft (https://www.acmicpc.net/problem/1005)
 * 문제 풀이
 *  건설순서 규칙을 ArrayList<>[]에 ArrayList<>[지어야할 건물] = 먼저 완공되어 있어야 하는 건물을 저장
 *  배열 dp에는 특정 건물을 짓는데 먼저 완공되어 있어야 하는 건물들 중 가장 오래 걸리는 시간과 특정 건물을 짓는 시간을 더한 값을 저장
 *  특정 건물 w를 지으려고 하면 dp[w]에 저장된 값이 있으면 그 값을 반환,
 *  없으면 먼저 완공되어 있어야 하는 건물들의 dp 값과 w를 짓는 시간을 더한 값을 반환
 *  만약 먼저 완공되어 있어야 하는 건물들의 dp 값이 없다면 재귀호출로 구함
 *
 * dp로만 풀었더니 예제 케이스의 답은 맞지만 시간 초과가 뜸 이를 해결하기 위해선 위상 정렬을 사용해야 함
 */

package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.stream.Stream;

// public class Main {
public class ACMCraft {
    static int[] buildTime; // 건설에 걸리는 시간
    static ArrayList<Integer>[] builtBuilding; // 건물을 짓기 위하여 지어야 하는 건물들
    static int[] dp; // 건물을 짓는데 걸리는 최대 시간

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        for (int t = 0; t < testCase; t++) {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]); // 건물의 개수
            int k = Integer.parseInt(input[1]); // 건설순서 규칙의 총 개수
            buildTime = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            builtBuilding = new ArrayList[n + 1];
            dp = new int[n + 1];

            for (int i = 1; i <= n; i++) // builtBuilding 초기화
                builtBuilding[i] = new ArrayList<>();

            for (int i = 0; i < k; i++) { // 입력 받은 건설순서 규칙을 builtBuilding에 넣음
                input = br.readLine().split(" ");
                // input[1]를 짓기 위해서는 input[0]을 먼저 지어야 하므로 builtBuilding[input[1]]에 input[0] 추가
                builtBuilding[Integer.parseInt(input[1])].add(Integer.parseInt(input[0]));
            }

            int building = Integer.parseInt(br.readLine()); // 건설해야 할 건물

            bw.write(Integer.toString(build(building)));
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static int build(int building) {
        if (dp[building] == 0) { // dp에 저장된 값이 없을 경우
            // building을 짓는데 먼저 지어야 하는 건물들 중 가장 오래 걸리는 시간과 building을 짓는 시간의 합을 dp에 저장
            for (int bb : builtBuilding[building])
                dp[building] = Math.max(dp[building], build(bb));

            dp[building] += buildTime[building - 1];
        }

        return dp[building];
    }
}
