import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		int res = 0;
		
		for(int i=0; i<N; i++)
			A[i] = sc.nextInt();
		for(int i=0; i<N; i++)
			B[i] = sc.nextInt();
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		for(int i=0; i<N; i++)
			res += A[N-1-i] * B[i];
		
		System.out.println(res);
	}
}
