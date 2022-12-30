package algorithm1;

import java.util.Arrays;
import java.util.Scanner;

public class Dwarf {
	/*
	 * 
	 * 먼저 정렬을 시키고 왼쪽 포인터 오른쪽 포인터를 만들어서 끝에서부터 더했을 때 합이 140을 찾기
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dwarf[] = new int[9]; // 난쟁이 9명을 입력받을 공간
		int sum = 0;
		// 난쟁이 9명 입력받기
		for (int i = 0; i < dwarf.length; i++) {
			dwarf[i] = sc.nextInt();
			sum += dwarf[i];
		}
		// 난쟁이 정렬하기
		Arrays.sort(dwarf);

		// 오른쪽 왼쪽 포인터 만들기
		int left;
		int right;
		left = 0;
		int target = sum - 100; // 40을 채우면 빼기
		right = dwarf.length - 1;

		// 더했을 때 합이 40이면 빼기
		while (left < right) {
			// dwarf[] 값의 맨 왼쪽 오른쪽을 찾아서 더해준다 
			int findnum = dwarf[left] + dwarf[right];
			
//			System.out.println(findnum);
			if (target == findnum) {
				dwarf[left] = 0;
				dwarf[right] = 0;
				break;
			}
			if (target > findnum) {
				left++;
			} else {
				right--;
			}
		}
		
		for(int i: dwarf) {
			if(i == 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}