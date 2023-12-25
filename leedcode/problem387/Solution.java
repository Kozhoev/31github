package leedcode.problem387;

class Solution {
    public int firstUniqChar(String s) {
        for (int i=0; i<s.length();i++){
            boolean c = false;
            for (int k =0; k<s.length();k++){
                if (i!=k && s.charAt(i)==s.charAt(k)){
                    c = true;
                    break;
                }
            }
            if(!c){
                return i;
            }
            }
        return -1;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();

        String input1 = "leetcode";
        String input2 = "loveleetcode";
        String input3 = "abcabc";

        int result1 = solution.firstUniqChar(input1);
        int result2 = solution.firstUniqChar(input2);
        int result3 = solution.firstUniqChar(input3);

        System.out.println("Result 1: " + result1); // Output should be 0
        System.out.println("Result 2: " + result2); // Output should be 2
        System.out.println("Result 3: " + result3); // Output should be -1
    }
}
