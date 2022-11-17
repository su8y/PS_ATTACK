package algorithm.graph.dijkstra;

import java.util.*;



public class Dijkstra {
    public static int V = 4;
    public static List<List<Pair>> adj = new ArrayList<>();

    public List<Integer> dijkstra(int src) {
        List<Integer> dist = Arrays.asList(new Integer[V]);
        for (int i = 0; i < dist.size(); i++) dist.set(i, Integer.MAX_VALUE);

        //자기자신은 0만큼 소요됨.
        dist.set(src, 0);

        PriorityQueue<Pair<Integer,Integer>> pq = new PriorityQueue<>();
        pq.offer(new Pair(src, 0));

        while (pq.isEmpty() == false) {
            int here = pq.peek().getFirst();
            int cost = pq.peek().getSecond();
            pq.poll();

            //지금꺼낸 cost가 원래있던 here 보다 크다면 continue;
            //그냥 무시한다는것.
            if (dist.get(here) < cost) continue;


            for (int i = 0; i < adj.get(here).size(); i++) {
                int there = (int) adj.get(here).get(i).getFirst();
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


}
