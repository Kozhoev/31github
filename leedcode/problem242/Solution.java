package leedcode.problem242;
import java.util.Arrays;

public class Solution {
    public static boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent")); // Output: true
        System.out.println(isAnagram("hello", "world"));   // Output: false
    }
}