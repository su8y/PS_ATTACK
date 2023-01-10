package Practice;

import java.util.Scanner;

public class Loop_Basic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= test; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sum = a + b;
			System.out.println(sum);
		}
		// 연산한 값을 저장해두고 값만 한번에 출력할 수 있을까?
		// 답 : 값을 배열에 저장해두고 향상된 for 문을 사용하면 가능하다.
		sc.close();
	}
}
