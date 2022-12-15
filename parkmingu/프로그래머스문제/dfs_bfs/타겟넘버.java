package parkmingu.프로그래머스문제.dfs_bfs;

public class 타겟넘버 {
    // 멤버변수화 시켜서 간단하게 사용하기
    int[] numbers;
    int target;
    int answer;

    void dfs(int index, int sum){
        //1. 탈출조건
        // 탈출조건은 number를 모두 조사하면 탈출하면 됨
        // 또한 재귀중에 sum의 값과 target의 값이 같아지면 answer의 값을 +1 함
        if(index == numbers.length){
            if(sum == target) answer++;
            // 이전 재귀로 돌아감
            return;
        }


        //2. 수행동작
        // 더하기 재귀
        // 인덱스를 다음으로 넘기고 sum에 number값을 더하고 다음 sum으로 넘김
        dfs(index + 1, sum + numbers[index]);

        // 빼기 재귀
        // 인덱스를 다음으로 넘기고 sum에 number값을 빼고 다음 sum으로 넘김
        dfs(index + 1, sum - numbers[index]);
    }

    public int solution(int[] numbers, int target) {
        answer = 0;
        this.numbers = numbers;
        this.target = target;

        // 깊이 탐색
        dfs(0,0);

        return answer;
    }
}
