package Backjoon;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b=a;
		int count = 0;
		int result = 0;
		while (true) {
			result = (((a % 10) * 10)) + (((a % 10) + (a / 10)) % 10);
			a = result;
			count++;
			if(b==result) {
				break;
			}

		}
		System.out.println(count);
	}
}
