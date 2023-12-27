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
}