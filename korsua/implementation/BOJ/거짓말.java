package korsua.implementation.BOJ;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class 거짓말 {
    public static HashSet<Integer> set;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int trust = scanner.nextInt();

        set = new HashSet<>();
        for (int i = 0; i < trust; i++) {
            set.add(scanner.nextInt());
        }
        for (int i = 0; i < m; i++) {
            int t = scanner.nextInt();
            if(extracted(t)){
                count++;
            }
        }

        System.out.println(count);

    }

    private static boolean extracted(int t) {
        for (int j = 0; j < t; j++) {
            Scanner scanner = new Scanner(System.in);
            if (set.contains(scanner.nextInt())) {
                return false;
            }
        }
        return true;
    }
}
