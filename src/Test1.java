public class Test1 {
    public static boolean recursive(int i){
        if(i == 5){
            System.out.println(i + " "+ true);
            return true;
        }
        i++;
        recursive(i);

        return false;

    }
    public static void main(String[] args) {
        System.out.println(recursive(1));


    }
}
