package leedcode.problem169;
//import java.util.Arrays;
//class Solution {
//    public int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        int n = nums.length;
//        return nums[n/2];
//    }
//}

class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    candidate = nums[i];
                    count = 1;
                }
            }
        }
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }
        return candidate;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int majorityElement = solution.majorityElement(nums);
        System.out.println("Majority Element: " + majorityElement);
    }
}