package algorithm_mg.dfs_bfs;

public class 네트워크 {

    // 방문(visited)는 양방향을 굳이 검사할 필요없이 한방양만 체크하는 방식임

    /* 
        [1, 1, 0], 
        [1, 1, 0], 
        [0, 0, 1]]
    */
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        // 방문을 검사할 배열
        boolean[] visited = new boolean[n];

        //
        for(int i = 0; i < n; i++){
            // boolean 타입은 false로 기본초기화됨
            if(!visited[i]){
                dfs(computers, i, visited);
                answer++;
            }
        }

        return answer;
    }

    void dfs(int[][] computers, int i, boolean[] visited){
		visited[i] = true;
		
		for (int j = 0; j < computers.length; j++) {
            // 재귀 호출의 조건
            // 1. 자기 자신이 아니며 (i != j)
            // 2. computer배열값이 1이고 (computers[i][j] == 1)
            // 3. visited[j]가 false인 경우 (visited[j] == false)
			if (i != j && computers[i][j] == 1 && visited[j] == false) {
				dfs(computers, j, visited);
			}
		}
    }
    

}
