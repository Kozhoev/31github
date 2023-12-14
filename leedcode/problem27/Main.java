package leedcode.problem27;
import java.util.Arrays;
class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0, edge = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                while (edge > 0) {
                    if (nums[edge] != val) {
                        nums[i] = nums[edge];
                        edge--;
                        break;
                    }
                    edge--;
                }
                count++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums.length - count;
    }
}

public class Main {
    public static void main(String[] args) {
        // Example array
        int[] nums = {3, 2, 2, 3, 4, 5};
        int val = 3;

        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Call the removeElement method
        int result = solution.removeElement(nums, val);

        // Display the modified array using Arrays.toString
        System.out.println("Modified Array: " + Arrays.toString(nums));

        System.out.println("Number of elements not equal to " + val + ": " + result);
    }
}

