package algorithm;


import algorithm.arrays.MergeSortClass;

import static algorithm.arrays.SortColorsClass.SortColor;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 0, 0};
        int[] arr2 = {4, 5, 6};
        MergeSortClass mergeSortClass = new MergeSortClass();

        MergeSortClass.mergeSorted(arr,3,arr2,3);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
