import java.util.Scanner;

public class X보다작은수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int num[] = new int[N];

		int X = sc.nextInt();

		int find[] = new int[N];

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			if (num[i] < X) {
				find[i] = num[i];
				System.out.println(find[i]);
			}
		}
		sc.close();
	}
}
