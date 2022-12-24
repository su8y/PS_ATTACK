package korsua.graph.dijkstra;

import java.util.*;



public class Dijkstra {
    /**
     *
     * 1. 시작점 start를 우선순위큐에 넣는다.
     * 2. 우선순위 큐에서 정점 x를뺀다.
     * 3. dist[x] != 현재빼낸값 이라면 4번을 생략한다.
     * 4. 정점 x에 연결된 각각의 정점 i에 대해 ,
     *      dist[i] = dist[i] > dist[x] + 간선의 길이
     *      (dist[i],i) 를우선순위 큐에 넣는다.
     * 5. 우선순위 큐에 원소가 남아 있다면 2번으로 돌아간다.
     */
    public static int V = 4;
    public static List<List<Pair>> adj = new ArrayList<>();

    public List<Integer> dijkstra(int src){
        List<Integer> distance =Arrays.asList(new Integer[V]);
        for (int i = 0; i < V; i++) distance.set(i, Integer.MAX_VALUE);

        PriorityQueue<Pair> pq = new PriorityQueue();
        //자기자신을 초기화함.
        distance.set(src,0);
        pq.offer(new Pair(src,0));

        while(pq.isEmpty() == false){
            Pair here = pq.poll();
            int hereVertax = (int) here.getFirst();
            int hereCost = (int) here.getSecond();

            if(distance.get(hereVertax) < hereCost) continue;

            for(int i =0; i < adj.get(hereVertax).size(); i++){
                Pair there = adj.get(hereVertax).get(i);
                int thereVertax = (int) there.getFirst();
                int thereCost = (int) there.getSecond() + hereCost;

                if(distance.get(thereVertax) > thereCost){
                    pq.offer(new Pair(thereVertax, thereCost));
                    distance.set(thereVertax, thereCost);
                }
            }
        }
        return distance;
    }
    public static void main(String[] args) {
        for (int i = 0; i < V; i++) {
            adj.add(i, new ArrayList<>());
        }
        adj.get(0).add(new Pair(1, 2));
        adj.get(1).add(new Pair(0, 2));
        adj.get(0).add(new Pair(3, 12));
        adj.get(3).add(new Pair(0, 12));
        adj.get(1).add(new Pair(2, 4));
        adj.get(2).add(new Pair(1, 4));
        adj.get(3).add(new Pair(2, 3));
        adj.get(2).add(new Pair(3, 3));
        List<Integer> dijkstra = new Dijkstra().dijkstra(0);
        System.out.println(dijkstra);


    }
    // 큐에 담고 지워도 되는 것
    public static void dij(int start,int N ){
        int dist[] = new int[N];
        PriorityQueue<Pair> q = new PriorityQueue<>();
        Arrays.fill(dist, Integer.MAX_VALUE);
        q.offer(new Pair(0, start));
        dist[start] = 0;

        while (!q.isEmpty()) {
            int cost = (int) q.peek().getFirst();
            int here = (int) q.peek().getSecond();

            for(Pair i : adj.get(here)){
                int there = (int) i.getSecond();
                int thereCost= (int) i.getFirst();
                if(dist[there] > thereCost + cost){
                    dist[there] = thereCost + cost;
                    q.offer(new Pair(thereCost + cost, there));
                }

            }

        }

    }


}
