package parkmingu;

import java.util.Stack;

public class 올바른괄호 {
    public static void main(String[] args) {
        String str = "()()()";
        String[] arr = str.split("");
        boolean answer = true;
        int add = 0;



//        while(!bracket.empty()){
            for(int i = str.length()-1; i >=0 ; i--){

            // add 가 0이상이면 실행
            if(str.charAt(i) == '('){
                add--;
            }
            else {
                add++;
            }

            if(add == -1){
                break;
            }
        }

        if(add != 0){
            answer = false;
        }

        System.out.println(answer);
    }
}
