package korsua.dp.leetcode;

public class LongestValidParentheses {
    static int[] cache;
    public static void main(String[] args) {
        String s = ")()))()()()((()(()()))(())";
        int len = s.length();
        char[] chars = s.toCharArray();

        cache = new int[len];
        if(chars[0] == '(') cache[0] = 1;
        // '('이 아니면 cache는 0인상태
        int max = 0 ;
        for(int i = 1 ; i< len; i++){
            int pv = cache[i-1];
            //짝수일때는 "(" 를 넣는다.  -> pv 전에있는 cache의 값을 +1 해서 넣는다.
            if(pv % 2 == 0 && chars[i] == '('){
                max = pv + 1 > max ? pv + 1: max;
                cache[i] = pv + 1;
            }
            else if(pv %2 != 0){
                if(chars[i] == ')'){
                    max = pv + 1 > max ? pv + 1: max;
                    cache[i] = pv + 1;
                }
                if( chars[i] =='('){
                    max = 1 > max ? 1: max;
                    cache[i] = 1;
                }
            }
            else cache[i] = 0;
        }
        System.out.println(max/2);

    }
}
