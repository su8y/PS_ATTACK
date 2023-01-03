package algorithm1;

import java.util.Scanner;

public class Oven_Clock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int input = sc.nextInt();
		int tmp = 0;
		
		// 더한값이 60을 넘었을때 실행되는 조건문
		if (input + min > 60) {
			System.out.println("실행1");
			hour++;
			tmp = min + input;
			min = tmp - 60;
			// input 값만 60이 넘을 때 실행되는 조건문
			if (input >= 60) {
				System.out.println("실행2"); // 더한값에서 60을 빼줘야함
				hour++;
				min = min - 60;
			}
		}
		// 인풋값 더한값이 딱 60일때 실행되는 조건문
		else if(input+min == 60) {
			System.out.println("실행55");
			hour++;
			min = min-60;
		}
		
		// 시간이 24시가 넘어간다면 00시로 맞춰주는 조건문
		if (hour >= 24) {
			System.out.println("실행4");
			hour -= 24;
		}
		// 입력값이 60이 넘지 않았을 때 실행되는 조건문
		else if (min + input < 60) {
			System.out.println("실행3");
			min = min + input;
		}

		System.out.printf("%d %d", hour, min);
	}
}
