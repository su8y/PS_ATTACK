import java.util.Scanner;

public class 과제_안내신분 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean students[] = new boolean[31];

		for (int i = 0; i < 28; i++) {
			students[sc.nextInt()] = true;
		}

		for (int i = 1; i < students.length; i++) {
			if (students[i] == false) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
