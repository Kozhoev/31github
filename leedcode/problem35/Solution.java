package leedcode.problem35;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int k = target;
        for (int i=0;i<nums.length; i++){
            if (nums[i]==k){
                return i;
            }else if (nums[i]<k){
                return i;
            }
        }
        return nums.length;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {1, 2, 3, 4, 5};
        int target = 2;

        int result = solution.searchInsert(nums, target);
        System.out.println("Index where target would be inserted: " + result);
    }
}