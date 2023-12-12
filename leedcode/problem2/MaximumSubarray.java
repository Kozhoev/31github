package leedcode.problem2;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {

        int currentSum = nums[0];
        int maxSum = nums[0];
        for (int i=1; i< nums.length; i++){
            currentSum = Math.max(nums[i],currentSum + nums[i]);
            maxSum = Math.max(currentSum,maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        MaximumSubarray solution = new MaximumSubarray();
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int result = solution.maxSubArray(nums);
        System.out.println(result);

    }
}
