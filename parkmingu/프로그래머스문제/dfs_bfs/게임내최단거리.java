package parkmingu.프로그래머스문제.dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;

public class 게임내최단거리 {
    // 갈 수 있는 곳은 true(1), 없는곳은 false(0)인 2차원 배열이 주어짐
    // 방문자는 true만 지나가면서 최단 거리를 구해야함
    // 한번 이동후 해당 행, 열을 다시 입력하여 재탐색함
    // 이동은 우 하 좌 상 순서로 탐색(왔던길을 제외한 곳중 나아갈곳이 없다면 길이막힌 것 이므로 -1 반환)
    // bfs에 필요한 값은 x, y, 전체좌표

    static int[] disX = {0, 1, 0, -1};
    static int[] disY = {1, 0, -1, 0};
    boolean[][] visited;
    int n, m;
    
    public int solution(int[][] maps) {
        n = maps.length;
        m = maps[0].length;
        
        visited = new boolean[n][m];
        return bfs(0, 0, maps);
    }

    public int bfs(int x, int y, int[][] maps){

        Queue<Point> q = new LinkedList<>();
        // 현재 위치를 큐에 삽입
        q.offer(new Point(x, y,1));
        visited[x][y] = true;

        while(!q.isEmpty()){
            Point p = q.poll();
            // 도착지점에 도착시 cost를 반환함
            if(p.x == n-1 && p.y == m-1) return p.cost;

            for(int i = 0; i < 4; i++) {
                // 우 하 좌 상 순서로 검사함
                int nx = p.x + disX[i];
                int ny = p.y + disY[i];
                // 좌표의 값이 범위를 초과하지 않게 조건을 설정
                if(nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if(maps[nx][ny] == 1 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        // 큐에 다음 좌표와 코스트값을 넣어가면서 계속 도착점 또는 막힐때까지 탐색을 진행함
                        q.offer(new Point(nx, ny, p.cost + 1));
                    }
                }
            }
        }

        // 이동할 곳이 없을시 -1 반환
        return -1;
    }

    class Point{

        int x;
        int y;
        int cost = 1;
    
        public Point(int x, int y, int cost) {
            this.x = x;
            this.y = y;
            this.cost = cost;
       }
    }
}