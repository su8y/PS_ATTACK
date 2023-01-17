import java.util.Scanner;

public class Oven_Clock1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int input = sc.nextInt();

		min += input;
		hour += (min / 60);
		min = min % 60;
		System.out.println(hour % 24 + " " + min);
	}
}
