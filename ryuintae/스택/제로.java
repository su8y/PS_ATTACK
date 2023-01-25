package Stack;

import java.util.Scanner;
import java.util.Stack;

public class 제로 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int tmp = 0;
		int sum = 0;

		for (int i = 0; i < K; i++) {
			tmp = sc.nextInt();
			if (tmp == 0) {
				stack.pop();
			} else {
				stack.push(tmp);
			}
		}

		for (int i : stack) {
			sum += i;
		}
		System.out.println(sum);
		sc.close();
	}
}
