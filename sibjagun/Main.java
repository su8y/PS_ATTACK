package Backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b[]=new int[a];
		int count=1;
		for(int i=0; i<a; i++) {
		b[i] =sc.nextInt();
		}
		Arrays.sort(b);
		for(int i=0; i<a-1; i++) {
			if(b[i]<b[i+1]) {
				count++;
			}
		}
		if(count==1) {
			--count;
			System.out.println(count);
		}
		
		else {
			System.out.println(count);	
		}
	}
}


