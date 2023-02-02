package Practice;

import java.util.Scanner;

public class Loop_Basic2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();

		for (int i = 1; i <= count; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.printf("Case #%d : %d \n", i, a + b);

		}
		sc.close();
	}
}
