package algorithm.graph.dijkstra;

class Pair<T,U> implements Comparable<Pair<T,U>> {
    private T first;
    private U second;

    Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public int compareTo(Pair<T, U> o) {
        return (int) this.first - (int)o.first;
    }
}
