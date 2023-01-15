import java.util.Scanner;

public class B9461 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		long[] res = new long[T];
		
		for (int i=0; i<T; i++) {
			int N = sc.nextInt();
			long[] dp = new long[N+5];
			
			dp[1] = dp[2] = dp[3] = 1;
			dp[4] = dp[5] = 2;
			
			if (N>=6) {
				for(int n=6; n<=N; n++) {
					dp[n] = dp[n-1] + dp[n-5];
				}
			}
			res[i] = dp[N];
		}
		for (long i : res) {
			System.out.println(i);
		}
	}
}
