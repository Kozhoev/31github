package leedcode.problem3;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length; i++) {
            for (int k = i + 1; k < nums.length; k++) {
                int t = nums[i] + nums[k];
                if (t == target) {
                    return new int[] {i, k};
                }
            }
        };
        return new int[] {};
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);

        // Print the result
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}