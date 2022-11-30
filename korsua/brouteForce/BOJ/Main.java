package korsua.brouteForce.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    private static int n;
    private static int max=0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).
                toArray();
        n = arr[0];
        int w = arr[1];
        arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        //정렬
        Arrays.sort(arr);
        int length = arr.length;
        for (int pivot = 0; pivot < length -2; pivot++) {
            int left = pivot + 1;
            int right = length -1;
            while (left < right) {
                int sum = arr[left] + arr[right] + arr[pivot];
                if(sum < w) left++;
                else if(sum > w) right--;
                else {
                    System.out.println(sum);
                    return;
                };
                sumation(sum,w);
            }

        }
        System.out.println(max);
    }
    public static void sumation(int sum,int w){
        if(sum < w) max = Math.max(sum,max);
    }
}
