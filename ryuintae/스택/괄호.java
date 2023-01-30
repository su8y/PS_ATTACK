package Stack;

import java.util.Scanner;
import java.util.Stack;

public class 괄호 {
	public static void main(String[] args) {
		Stack<Character> stack = new Stack<>();
		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();

		Character tmp = ' ';
		
		for (int i = 0; i < K; i++) {
			String st = sc.next();
			stack.clear();
			for (int j = 0; j < st.length(); j++) {
				tmp = st.charAt(j);
				if (tmp == '(') {
					stack.push(tmp);
				} else {
					if (stack.isEmpty()) {
						stack.push('A');
						break;
					} else {
						stack.pop();
					}
				}

			}
			System.out.println(stack.empty() ? "YES" : "NO");
		}
		sc.close();
	}
}
