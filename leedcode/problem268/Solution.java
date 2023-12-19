package leedcode.problem268;


class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            boolean result = false;
            for (int k = 0; k < nums.length; k++) {
                if (i == nums[k]) {
                    result = true;
                    break;
                }
            }
            if (!result){
                return i;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        // Example array
        int[] nums = {3, 0, 1};

        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Call the missingNumber function and store the result
        int result = solution.missingNumber(nums);

        // Print the result
        System.out.println("The missing number is: " + result);
    }
}


//class Solution {
//    public int missingNumber(int[] nums) {
//        int n = nums.length;
//        for (int i = 0; i < n; i++) {
//            boolean found = false;
//            for (int k = 0; k < nums.length; k++) {
//                if (i == nums[k]) {
//                    found = true;
//                    break;
//                }
//            }
//            if (!found) {
//                return i;
//            }
//        }
//        // If no missing number is found, return the last number in the sequence
//        return n;
//    }
//}