package Practice;

import java.util.Scanner;

public class Star_Check2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= input - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		sc.close();
	}
}
