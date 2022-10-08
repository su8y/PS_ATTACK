package algorithm;


import static algorithm.arrays.MoveZerosClass.moveZeros;

public class Main {
    public static void main(String[] args) {
        int[] arr= {0,0,1,2,0,0,3,4,5};
        moveZeros(arr);

        for(int i : arr){
            System.out.println(i + " ");
        }
    }
}
