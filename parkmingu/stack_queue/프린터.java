package parkmingu.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class 프린터{
    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        int head = 0;
        int tail = 0;

        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        Queue<Integer> queue3 = new LinkedList<>();

        // 원본 큐, 복사본 큐, 위치값 큐 총 3개의 큐를 사용함
        for(int i = 0; i < priorities.length; i++){
            queue1.offer(priorities[i]);
            queue2.offer(priorities[i]);
            queue3.offer(i);
        }

        while(queue3.peek() != location){
            // 큐의 맨앞의 값으로 비교
            head = queue2.poll();
            while(true){
                // 만약 맨 앞의 값보다 큰 값이 있다면 원본 큐의 head를 tail로 이동
                // 또한 좌표 큐도 뒤로 이동
                if(head < queue2.poll()){
                    queue1.offer(queue1.poll());
                    queue3.offer(queue3.poll());
                    for(int i = 0; i < priorities.length; i++){
                        tail = queue1.poll();
                        queue1.offer(tail);
                        queue2.offer(tail);
                    }
                    break;
                }
            }
        }

        System.out.println(queue3.peek());
    }
}