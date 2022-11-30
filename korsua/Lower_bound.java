package korsua;

public class Lower_bound {
    int solution(int[] nums, int target){
        int first = 0;
        int last = nums.length - 1;

        while (first < last) {
            int mid = (first + last) / 2;
            if (nums[mid] < target) {
                first = mid + 1;
            } else {
                last = mid;
            }
        }
        return first;
    }

    public static void main(String[] args) {
        int target = 5;
        int nums[] = {1, 3, 5, 5, 5, 5, 6};
        int solution = new Lower_bound().solution(nums, target);
        System.out.println(solution);


    }
}
