package algorithm.graph.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

public class Main {
    private static int[][] visited;
    private static int[][] graph;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = new int[2];
        // y [0] x [1]
        input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int m = input[1];
        graph = new int[n][m];
        visited = new int[n][m];
        for(int i = 0 ; i < input[0]; i++){
            graph[i] = Arrays.stream(br.readLine().split("", 6)).mapToInt(Integer::parseInt).toArray();
        }
        for(int i = 0 ; i< n; i++){
            visited[i] = graph[i].clone();
        }
        bfs(0,0,n,m);


    }

    private static void bfs(int x, int y, int n, int m) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(graph[y][x]);
        visited[y][x] = 1;
        int count = 0;
        mywhile:
        while(q.isEmpty() == false){
            count++;
            int here = q.poll();
            for(int i = 0 ; i< 4; i++){
                int t_x = x + dx[i];
                int t_y = y + dy[i];
                if(t_x >= 0 && t_x < graph.length
                        && t_y >= 0 && t_y < graph.length
                        && (visited[t_y][t_x] == 1)
                ){
                    if(t_y ==m-1 && t_x ==n-1) {
                        count++;
                        break mywhile;
                    }
                    visited[t_y][t_x] = count;
                    q.offer(graph[t_y][t_x]);
                }
            }

        }
        System.out.println(visited[n-1][m-1]);
    }
}