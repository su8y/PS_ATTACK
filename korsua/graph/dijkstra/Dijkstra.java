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

    public List<Integer> dijkstra(int src) {
        List<Integer> dist = Arrays.asList(new Integer[V]);
        for (int i = 0; i < dist.size(); i++) dist.set(i, Integer.MAX_VALUE);

        //자기자신은 0만큼 소요됨.
        dist.set(src, 0);

        PriorityQueue<Pair<Integer,Integer>> pq = new PriorityQueue<>();
        pq.offer(new Pair(src, 0));

        // 5 번
        while (pq.isEmpty() == false) {
            int here = pq.peek().getFirst();
            int cost = pq.peek().getSecond();
            pq.poll();

            // 현재 큐에서 꺼낸 cost가 원래보다 크다면 무시한다.
            // 3번 위배
            if (dist.get(here) < cost) continue;


            for (int i = 0; i < adj.get(here).size(); i++) {
                // adj.get(here)의 연결된 정점
                int there = (int) adj.get(here).get(i).getFirst();
                // 연결된정점의 간선의 길이
                int nexDist = cost + (int) adj.get(here).get(i).getSecond();

                //현재 가지고있는 cost보다 next Dist가 더 작다면 pq에 넣어준다.
                if (dist.get(there) > nexDist) {
                    dist.set(there, nexDist);
                    pq.offer(new Pair(there, nexDist));
                }
            }

        }

        return dist;
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
