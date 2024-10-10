/*
 * 문 제 : 백준 1108번 - 검색 엔진 (https://www.acmicpc.net/problem/1108)
 * 문제 풀이
 *
 */

package Baekjoon;

import java.io.*;
import java.util.*;

// public class Main {
public class BOJ_1108_검색엔진 {
    static ArrayList<Integer>[] link = new ArrayList[1251];
    static Stack<Integer> stack = new Stack<>();
    static int[] scc;
    static boolean[] checkScc;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> site = new HashMap<>();
        int[] rank;
        int[] inDegree;
        ArrayList<Integer>[] sccLink;
        Queue<Integer> queue = new LinkedList<>();
        int siteCnt = 0;
        int website;

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");

            if (site.get(input[0]) == null) {
                site.put(input[0], ++siteCnt);
                link[siteCnt] = new ArrayList<>();
            }

            for (int j = 2; j < input.length; j++) {
                if (site.get(input[j]) == null) {
                    site.put(input[j], ++siteCnt);
                    link[siteCnt] = new ArrayList<>();
                }

                link[site.get(input[0])].add(site.get(input[j]));
            }
        }

        scc = new int[siteCnt + 1];
        checkScc = new boolean[siteCnt + 1];
        rank = new int[siteCnt + 1];
        inDegree = new int[siteCnt + 1];
        sccLink = new ArrayList[siteCnt + 1];

        for (int i = 1; i <= siteCnt; i++) {
            rank[i] = 1;
            sccLink[i] = new ArrayList<>();

            if (scc[i] == 0)
                dfs(i);
        }

        for (int i = 1; i <= siteCnt; i++) {
            for (int node : link[i]) {
                if (scc[i] != scc[node]) {
                    inDegree[i]++;
                    sccLink[node].add(i);
                }
            }

            if (inDegree[i] == 0)
                queue.offer(i);
        }

        website = site.get(br.readLine());

        while (!queue.isEmpty()) {
            int node = queue.poll();

            if (node == website)
                break;

            for (int next : sccLink[node]) {
                rank[next] += rank[node];
                inDegree[next]--;

                if (inDegree[next] == 0)
                    queue.offer(next);
            }
        }

        bw.write(Integer.toString(rank[website]));
        bw.flush();
        br.close();
        bw.close();
    }

    public static int dfs(int v) {
        if (scc[v] == 0) {
            scc[v] = v;
            stack.add(v);
            checkScc[v] = true;

            for (int next : link[v])
                if (checkScc[next] || scc[next] == 0)
                    scc[v] = Math.min(scc[v], dfs(next));

            if (scc[v] == v) {
                while (true) {
                    int node = stack.pop();

                    scc[node] = v;
                    checkScc[node] = false;

                    if(node == v)
                        break;
                }
            }
        }

        return scc[v];
    }
}
