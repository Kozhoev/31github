package leedcode.problem20;

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i<nums.length; i++){
            if (nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        System.out.println(nums);
        }
        return k;
    }
}
public class Main {
    public static void main(String[] args) {
        // Example array
        int[] nums = {3, 2, 2, 3, 4, 5};
        int val = 3;

        // Create an instance of the Solution class
        Solution solution = new Solution();


    }
}
