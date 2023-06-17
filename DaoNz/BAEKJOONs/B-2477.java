import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> dir = new LinkedList<>();
        Deque<Integer> que = new LinkedList<>();
        int ch = sc.nextInt();

        boolean[] check = new boolean[5];
//        for (int i = 1; i <= 4; i++) max[i] = false;

        for (int i = 0; i < 6; i++) {
            int d = sc.nextInt();
            dir.offer(d);
            que.offer(sc.nextInt());
            check[d] = !check[d];
        }

        while (!(check[dir.peekFirst()] && check[dir.peekLast()])) {
            dir.offerLast(dir.pollFirst());
            que.offerLast(que.pollFirst());
        }

        int area = que.pollFirst() * que.pollLast();
        que.pollFirst();
        que.pollLast();
        int areaNo = que.pollFirst() * que.pollLast();

        System.out.println((area - areaNo) * ch);


    }
}
