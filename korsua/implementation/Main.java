package korsua.implementation;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        int k = 1000;
        int[] scoville = {2,1,3,1,1,1};

        int[] copy= scoville.clone();
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i = 0 ; i < copy.length; i++){
            q.offer(copy[i]);
        }
        int answer = 0;
        while(q.peek() < k && q.size() >= 2){
            answer++;
            int first = q.poll();
            int second = q.poll();
            q.offer(first + (second * 2));
        }
//        Arrays.sort(copy);
//        while(i < scoville.length -1 && copy[i] < k){
//            copy[i+1] = copy[i] + (copy[i +1] * 2);
//            i++;
        if(q.peek() < k) System.out.println(-1);
//        }
        System.out.println(answer);
    }
}
