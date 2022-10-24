package algorithm;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int nc = scanner.nextInt();

            int ec = scanner.nextInt();
            System.out.println(nc +" " +ec);
            System.out.println(nc + ec);
        }

    }
}
