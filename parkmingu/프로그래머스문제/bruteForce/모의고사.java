package parkmingu.프로그래머스문제.bruteForce;

import java.util.ArrayList;
import java.util.Arrays;

public class 모의고사 {
    // 브루트포스는 보통 for while등을 이용한 loop 또는 재귀함수를 이용한다
    public int[] solution(int[] answers) {

        // 수포자들의 답안지를 2차원 배열로 생성
        int[] person1 = {1,2,3,4,5}; //이만큼씩 반복
        int[] person2 = {2,1,2,3,2,4,2,5};
        int[] person3 = {3,3,1,1,2,2,4,4,5,5};

        int[] count = new int[3];
        int[] answer = new int[3];

        // 답은 1,2,3,4,5
        for(int i =0; i<answers.length; i++){
            if(person1[i%person1.length] == answers[i]) count[0]++;
            if(person2[i%person2.length] == answers[i]) count[1]++;
            if(person3[i%person3.length] == answers[i]) count[2]++;
        }

        int max = Math.max(Math.max(count[0], count[1]),count[2]);
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(max==count[0]) list.add(1); //max값이랑 같으면 넣는다.
        if(max==count[1]) list.add(2);
        if(max==count[2]) list.add(3);

        answer = new int[list.size()];
        
        for(int i =0; i<answer.length; i++) {
        	answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        모의고사 a = new 모의고사();
        int arr[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(a.solution(arr)));
    }
}

