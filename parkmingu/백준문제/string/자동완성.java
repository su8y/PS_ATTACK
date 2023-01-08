package parkmingu.백준문제.string;

import java.util.Scanner;

public class 자동완성 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        if (word.equals("N") || word.equals("n")) {
            System.out.print("Naver D2");
        } else {
            System.out.print("Naver Whale");
        }
    }

}
