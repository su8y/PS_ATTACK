package parkmingu.백준문제;

import java.util.Arrays;
import java.util.Scanner;

public class 단어공부 {
    public static void main(String[] args) {
        // 문자열을 단어로 쪼개서 검사함
        // 단어는 대,소문자를 가리지 않으므로 아스키코드를 이용해 소문자로 만들어 검사를 진행한다
        Scanner sc = new Scanner(System.in);

        // A ~ Z 65 ~ 90, a ~ z 97 ~ 122
        int[] check = new int[26];
        int[] check_2 = new int[26];
        String alpa = sc.next();

        for(int i = 0; i < alpa.length(); i++){
            // 대문자 검사
            if((int)alpa.charAt(i) >= 65 && (int)alpa.charAt(i) <= 90){
                check[((int)alpa.charAt(i)) - 65]++;
            }// 소문자 검사
            else if((int)alpa.charAt(i) >= 97 && (int)alpa.charAt(i) <= 122){
                check[(int)alpa.charAt(i) - 97]++;
            }
        }

        for(int i =0; i < check.length; i++){
            check_2[i] = check[i];
        }

        // 정렬
        Arrays.sort(check_2);


        // 정렬을 했기때문에 맥스값은 맨뒤값이 된다 만약 len-1과 len-2가 같다면 맥스값은 존재하지 않는 것이다
        if(check_2[check_2.length-1] == check_2[check_2.length-2]){
            System.out.println("?");
        }else{
            for(int i =0; i < check.length; i++){
                if(check[i] == check_2[check_2.length-1]){
                    char ch = (char)(i+65);
                    System.out.println(ch);
                }
            }
        }


        
    }
}
