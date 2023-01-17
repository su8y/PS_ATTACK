package Practice;

import java.util.Scanner;

public class Receipt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int kinds = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= kinds; i++) {
			int price = sc.nextInt();
			int count = sc.nextInt();
			price *= count;
			sum += price;
		}
		if (total == sum) {
			System.out.println("Yes");
			System.out.println(sum);
		} else
			System.out.println("No");
		System.out.println(sum);
		sc.close();
	}
}
