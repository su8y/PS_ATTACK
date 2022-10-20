package algorithm.queue;

import java.util.*;

/*
progresses	speeds	return
[93, 30, 55]	[1, 30, 5]	[2, 1]
[95, 90, 99, 99, 80, 99]	[1, 1, 1, 1, 1, 1]	[1, 3, 2]
 */
public class Programmers42586 {
    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int rear = 0;
        int count = 0;

        // 리어가 array.length 보다 작을때까지 반복
        while(rear < progresses.length){
            for(int i = 0 ; i < progresses.length; i++){
                int times = 100 - progresses[rear];
                // 리어의 값과 차이를 곱해준다.
                progresses[i] += (times * speeds[i]);
            }
            while(rear < progresses.length && progresses[rear] >= 100){
                ++rear;
                ++count;
            }
            System.out.println(count);
            count=0;

        }


        return answer;
    }

    public static void main(String[] args) {
        int[] progress ={ 93 , 30 ,55};
        int[] speeds = {1,30,5};
        solution(progress,speeds);

    }

}
