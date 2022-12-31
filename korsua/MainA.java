package korsua;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainA {
    static int n ;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int tmp =Integer.parseInt(br.readLine());
            solve(tmp);
        }
    }

    private static void solve(int number) throws IOException {
        int sum = 0;
        List<Integer> list = new ArrayList<>();

        for(int i = 2 ; i * i< number; i++){
            if (number % i == 0) {
                list.add(i);
                list.add(number/ i);
                sum += i;
                sum += (number / i);
            }
        }
        if(sum + 1 > number){ // 과잉수ㅓㅓㅓㅓㅓㅓㅓㅓㅓ
            solve2(list);
//            System.out.println("Good Bye");
        }else{
            System.out.println("BOJ 2022");
            return;
        }
    }
    private static void solve2(List<Integer> list) throws IOException {
        int sum = 0;

        int number ;
        for(int j=0;j<list.size();j++){
            sum = 0;
            number =list.get(j);
            for(int i = 2 ; i * i< number; i++){
                if (number % i == 0) {
                    sum += i;
                    sum += (number / i);
                }
            }
            if(sum + 1 > number) { // 완전 부족수
                System.out.println("BOJ 2022");
                return;
            }
        }
        System.out.println("Good Bye");
    }
}