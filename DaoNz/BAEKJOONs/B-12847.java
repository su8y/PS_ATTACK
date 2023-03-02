import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) arr[i] = sc.nextInt();
        

        long max = 0;
        for (int i = 0; i < N - M + 1; i++) {
            long now = 0;
            for (int j = 0; j < M; j++) now += arr[i + j];
            
            max = Math.max(now, max);
        }
        System.out.println(max);
    }
}
