/*
 * 작성일	: 2022년 12월 26일
 * 문 제 	: 백준 2309번 - 일곱 난쟁이
 * 		  https://www.acmicpc.net/problem/2309
 */

package _2022_12_22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SevenDwarfs {
	public static void main(String[] args) throws IOException {
		Queue<Integer> queue = new LinkedList<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int sum = 0, num = 0;

		for (int i = 0; i < 9; i++) {
			num = Integer.parseInt(br.readLine());
			queue.offer(num);
			sum += num;
		}

		for (int i = 0; i < 8; i++) {
			num = queue.poll();
			stack.push(num);
			sum -= num;

			for (int j = 0; j < 8; j++) {
				num = queue.poll();
				stack.push(num);
				sum -= num;

				if (sum == 100) {
					Collections.sort((LinkedList<Integer>) queue);
					for (int item : queue) {
						bw.write(Integer.toString(item));
						bw.newLine();
						bw.flush();
					}

					br.close();
					bw.close();
					return;
				}

				queue.offer(stack.pop());
				sum += num;
			}

			num = stack.pop();
			queue.offer(num);
			sum += num;
		}

		br.close();
		bw.close();
	}
}
