import java.util.Scanner;

public class 최소최대 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int num[] = new int[N];

		int max = -1000000;
		int min = 1000000;
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		max = num[0];
		min = num[0];

		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			} else if (num[i] < min) {
				min = num[i];
			}
		}
		System.out.printf("%d %d", min, max);
		sc.close();
	}
}
