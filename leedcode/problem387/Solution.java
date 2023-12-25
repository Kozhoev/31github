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

}
