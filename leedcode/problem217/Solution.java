package leedcode.problem217;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        for (int c = 0; c < nums.length; c++) {
            for (int k = c + 1; k < nums.length; k++) {
                if (nums[c] == nums[k]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {1, 2, 3, 4, 5, 1};
        boolean hasDuplicate = solution.containsDuplicate(nums);

        System.out.println("Array contains duplicate: " + hasDuplicate);
    }
}
