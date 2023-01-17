import java.util.Scanner;

public class 개수세기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int arr[] = new int[n];

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int find = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {
			if (find == arr[i]) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
