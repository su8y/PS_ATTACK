package algorithm_mg.bruteForce;

import java.util.Arrays;

public class 모의고사 {
    // 브루트포스는 보통 for while등을 이용한 loop 또는 재귀함수를 이용한다
    public int[] solution(int[] answers) {
        int sx[][] = {};
        int[] answer = {};
        
        for(int i = 0; i < sx.length;){
            int cnt = 0;
            for(int j = 0; j < sx[i].length; j++){
                if(sx[i][j] == answers[j]){
                    cnt++;  
                    answer[i] = cnt;
                    System.out.println(cnt);
                }
            }
        }

        Arrays.sort(answer);

        System.out.println(Arrays.toString(answer));

        return answer;
    }

    public static void main(String[] args) {
        모의고사 a = new 모의고사();
        int arr[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(a.solution(arr)));
    }
}

