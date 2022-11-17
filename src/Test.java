import java.util.*;

public class Test {
    class Student {
        int no;
        int po;

        public int getNo() {
            return no;
        }

        public void setNo(int no) {
            this.no = no;
        }

        public int getPo() {
            return po;
        }

        public void setPo(int po) {
            this.po = po;
        }

    }
    public static void main(String[] args) {
        int n = 6;
        int[] student = {6, 1, 4, 2, 5, 1, 3, 3, 1, 6, 5};
        int[] point = {3, 2, 5, 3, 4, 2, 4, 2, 3, 2, 2};

        System.out.println(solution(n, student, point));

    }

    private static int solution(int n, int[] student, int[] point) {
        int count = 0;
        for(int i = 0 ; i<n; i++){

        }
        for(int i = 0, len = student.length; i < len; ++i){

        }

        return count;
    }
}
//
//    public static String solution(String line){
//        StringBuilder builder = new StringBuilder();
//        int i =0;
//        int j = 0;
//        int len = line.length();
//        while(i < len){
//            j = i + 1;
//            char target = line.charAt(i);
//
//            while(j < len && target == line.charAt(j)){
//                j++;
//            }
//
//            builder.append(line.charAt(i));
//            if(i != j - 1) builder.append('*');
//            i = j;
//        }
//        return builder.toString();
//    }
