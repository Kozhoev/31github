package leedcode.problem88;

public class Main {
    public static void main(String[] args) {
        // Example arrays
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;

        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Call the merge method
        solution.merge(nums1, m, nums2, n);

        // Print the merged array
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}

