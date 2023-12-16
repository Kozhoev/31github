package leedcode.problem126;

class Solution {
    public int singleNumber(int[] nums) {
        for (int i=0; i<nums.length;i++){
            boolean s = false;
            for (int k = 0; k<nums.length; k++){
                if (i!=k && nums[i]==nums[k]){
                    s = true;
                    break;
                }
            }
            if (!s){
                return nums[i];
            }
        }
        return -1;
    }
}
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
