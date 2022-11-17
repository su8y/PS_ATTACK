//public class Testa {
//    public static int solution(String[] map) {
//        int answer = 0;
//        answer = Testa.dfs(0,0,0,map);
//    }
//    public static int dfs(int x, int y, int count,String[] map){
//
//
//    }
//
//    public static void main(String[] args) {
//        String[] worldmap = {"..XXX", "..XXX","...XX","X....","XXX.."};
//
//        System.out.println(solution(worldmap));
//
//    }
//}
////
////    public static String solution(String line){
////        StringBuilder builder = new StringBuilder();
////        int i =0;
////        int j = 0;
////        int len = line.length();
////        while(i < len){
////            j = i + 1;
////            char target = line.charAt(i);
////
////            while(j < len && target == line.charAt(j)){
////                j++;
////            }
////
////            builder.append(line.charAt(i));
////            if(i != j - 1) builder.append('*');
////            i = j;
////        }
////        return builder.toString();
////    }
