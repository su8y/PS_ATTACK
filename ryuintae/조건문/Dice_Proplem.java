package Practice;

import java.util.Scanner;

public class Dice_Proplem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dice1 = sc.nextInt();
		int dice2 = sc.nextInt();
		int dice3 = sc.nextInt();
		int max = 0;

		if (dice1 == dice2 && dice1 == dice3 && dice2 == dice3) {
			System.out.println(10000 + dice1 * 1000);
		} 
		else if (dice1 == dice2 || dice2 == dice3 || dice1 == dice3) {
			if(dice1 == dice2) {
				System.out.println(1000 + dice1 * 100);
			}
			else if(dice2 == dice3) {
				System.out.println(1000 + dice2 * 100); 
			}
			else if(dice1 == dice3) {
				System.out.println(1000 + dice1 * 100);
			}
		} 
		else if (dice1 != dice2 && dice1 != dice3 && dice2 != dice3) {
			if (dice1 < dice2) {
				max = dice2;
			} else
				max = dice1;

			if (max < dice3) {
				max = dice3;
			}
			System.out.println(max * 100);
			// Math.max 함수를 사용하면 더 간편하게 큰 값을 찾을 수 있다.
			// System.out.print(Math.max (Math.max(dice1, dice2),dice3)*100);
		}
		sc.close();
	}
}
