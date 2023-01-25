package Stack;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

public class 스택 {

	public static void main(String[] args) throws Exception {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt = sc.nextInt();

		for (int i = 0; i < cnt; i++) {
			String input = sc.next();
			if (input.contains("push")) {
				int input2 = sc.nextInt();
				stack.push(input2);
			} else if (input.equals("pop")) {
				if (!stack.empty()) {
					int tmp = stack.pop();
					bw.write(tmp + "\n");
				} else {
					bw.write("-1" + "\n");
				}

			} else if (input.equals("size")) {
				bw.write(stack.size() + "\n");
			} else if (input.equals("empty")) {
				if (stack.empty()) {
					bw.write("1" + "\n");
				} else {
					bw.write("0" + "\n");
				}
			} else if (input.equals("top")) {
				if (stack.empty()) {
					bw.write("-1" + "\n");
				} else {
					bw.write(stack.peek() + "\n");
				}
			}
		}
		bw.flush();
		bw.close();
		sc.close();
	}
}