package algorithm;

import java.util.Scanner;

public class 동전0 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		int[] coin = new int[N];

		int count = 0;

		for (int i = 0; i < N; i++) {
			coin[i] = sc.nextInt();
		}

		// 가장 높은 가치의 동전부터 탐색
		for (int i = N - 1; i >= 0; i--) {
			if (K >= coin[i]) {
				count += (K / coin[i]);
				K = (K % coin[i]);
			}
		}
		System.out.println(count);
		sc.close();
	}
}
