package parkmingu.백준문제.string;

import java.util.Scanner;

public class 과제안내신분 {
    public static void main(String[] args) {
        // 학생은 28명을 받음
        int[] student = new int[28];
        // 검사를 진행할 불린타입의 배열 기본적으로 false로 초기화
        boolean[] check = new boolean[30];
        // 빠진 학생을 담을 변수
        int a = 0, b = 0;

        Scanner sc = new Scanner(System.in);

        // 0 ~ 27
        for (int i = 0; i < student.length; i++) {
            student[i] = sc.nextInt();
        }

        for (int i = 0; i < student.length; i++) {
            // 값이 있는 인덱스를 true로 변경
            // 또한 check의 범위는 0~29 이므로 student가 30이 나올경우 범위초과가 나옴 그러므로 -1 필요
            check[student[i] - 1] = true;
        }

        // 빠진 학생은 false로 되어있으므로 해당 인덱스의 값이 빠진학생의 번호-1 일 것임 그값을 a에 담고 a에 값을 담은 경우 b에 담는다
        for (int i = 0; i < check.length; i++) {
            if (check[i] == false) {
                if (a == 0) {
                    a = i;
                } else {
                    b = i;
                }
            }
        }

        // 값이 더 작은 쪽을 먼저 출력
        if (a < b) {
            // 위에서 값에 -1씩을 해줬기때문에 다시 +1을 해줌
            System.out.println(a + 1);
            System.out.println(b + 1);
        } else {
            System.out.println(b + 1);
            System.out.println(a + 1);
        }

    }
}
