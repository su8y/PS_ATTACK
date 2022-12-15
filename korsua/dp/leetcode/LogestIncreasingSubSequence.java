package korsua.dp.leetcode;

public class LogestIncreasingSubSequence {
    public static void main(String[] args) {
        int arr[] = {1,2,5,3,2,5,6,6,7,8};
        int reuslt = solve(arr);
    }

    private static int solve(int[] arr) {
        if(arr.length == 0) return 0;
        return 1;
    }
}
