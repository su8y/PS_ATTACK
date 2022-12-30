public class 일곱난쟁이 {
    static int[] arr = new int[9];
    public static void main(String[] args) throws IOException {
            int[] nan = new int[9]; // 난쟁이값을 9명 넣는 배열
            boolean[] nan1 = new boolean[9]; // 넣었는지 안넣었는지 확인하는 불리안 배열
            List<Integer> list = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < nan.length; i++) {
                nan[i] = sc.nextInt();
            }
            int sum = 0;
            int count=0;
            while(true) {
                double i1 = Math.random();
                int randomValue = (int) (i1 * 9); // 0~8 까지의 숫자를 아무거나 입력받음
                if (randomValue >= 0 && nan1[randomValue] == false&& count<8) {
                    sum += nan[randomValue];
                    nan1[randomValue] = true;
                    list.add(nan[randomValue]);
                    count++;
                }
                else if(count==7 && sum==100){
                    break;
                }
                else if(count==8){
                    count =0;
                    sum=0;
                    list.clear();
                    for(int i=0; i<9; i++) {
                        nan1[i] = false;
                    }
                }
            }

        Collections.sort(list);
        for (Integer integer : list) {
            System.out.println(integer);
            
        }
    }

}
