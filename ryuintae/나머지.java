import java.util.Scanner;

public class 나머지 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt() % 42;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				// 인덱스0과 1~9까지 비교해야되기 때문에 +1 을 함
				if (arr[i] == arr[j]) {
					arr[j] = 444;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 444) {
				count++;
			}
		}
		System.out.println(count);

		sc.close();
	}
}
