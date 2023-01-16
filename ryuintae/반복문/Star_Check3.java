package Practice;

import java.util.Scanner;

public class Star_Check3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();
		for (int i = 1; i <= input; i++) {
			for (int j = input; j > 0; j--) {
				if (j <= i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		sc.close();
	}
}
