import java.util.Scanner;

public class 평균 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int M = 0;

		int test[] = new int[N];

		double tmp = 0;

		for (int i = 0; i < test.length; i++) {
			test[i] = sc.nextInt();

			if (test[i] > M) {
				M = test[i];
			}
		}

		for (int i = 0; i < test.length; i++) {
			tmp += (double) test[i] / M * 100;
			// int형은 값이 0이 나오기 때문에 형변환 필수
		}
		System.out.println(tmp / N);

		sc.close();
	}
}
