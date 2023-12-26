package leedcode.problem350;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> intersection = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            boolean c = false;
            for (int k = 0; k < nums2.length; k++) {
                if (nums1[i] == nums2[k]) {
                    c = true;
                    intersection.add(nums1[i]);
                    break;
                }
            }
        }

        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }

        return result;
    }
    public static void main(String[] args) {
            Solution solution = new Solution();
            int[] nums1 = {1, 2, 2, 1};
            int[] nums2 = {2, 2};

            int[] result = solution.intersect(nums1, nums2);

            System.out.print("Intersection: ");
            for (int num : result) {
                System.out.print(num + " ");
            }
    }
}



