import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int[] coin = new int[N];
		int res = 0;
		
		for(int i=0; i<N; i++) 
			coin[i] = sc.nextInt();
		
		for(int i=N-1; i>=0; i--) {
			res += A/coin[i];
			A %= coin[i];
		}
		System.out.println(res);
	}
}
