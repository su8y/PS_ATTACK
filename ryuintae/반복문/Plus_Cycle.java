package Practice;

import java.util.Scanner;

public class Plus_Cycle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int count = 0;

		if (input < 10) {
			input *= 10;
		}

		int sum = input;

		while (true) {
			int left = sum / 10;
			int right = sum % 10;
			sum = left + right; 

			sum = right * 10 + sum % 10; 
			// 오른쪽 값을 십의자리로 만들어주고 %10 을 사용해서 일의자리를 만듦

			count++;
			if (sum == input) {
				break;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
