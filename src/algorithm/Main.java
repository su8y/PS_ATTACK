package algorithm;


import static algorithm.arrays.SortColorsClass.SortColor;

public class Main {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 2, 0, 0, 2, 0, 1};
        SortColor(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
