import java.util.Scanner;

public class 최대값찾기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num[] = new int[10];
		int max = 0;
		int line = 0;
		for (int i = 1; i <= 9; i++) {
			num[i] = sc.nextInt();
			if (num[i] > max) {
				max = num[i];
				line = i;
			}
		}
		System.out.println(max + "\n" + line);

		sc.close();
	}
}
