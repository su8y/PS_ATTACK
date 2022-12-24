package korsua.tree.leetcode;

import java.util.Vector;

public class 상호배타적집합 {
    Vector<Integer> parent;
    Vector<Integer> rank;
    public 상호배타적집합(int n){
        parent = new Vector<>();
        rank = new Vector<>();

        for(int i =0; i < n; i++){
            parent.add(i);
            rank.add(1);
        }
    }
    public int find(int u){
        if (u == parent.get(u)){
            return u;
        }
        //경로 압축 최적화
        int ret = find(parent.get(u));
        parent.set(u,ret);
        return ret;
    }

    public void merge(int u, int v){
        u = find(u);
        v = find(v);

        if ( u == v) return;
        if(rank.get(u) > rank.get(v)){
            int tmp = u;
            u = v;
            v = tmp;
        }

        // vol.1
        parent.set(u,v);

        if(rank.get(u) == rank.get(v)) rank.set(v, rank.get(v) + 1);
    }

}
