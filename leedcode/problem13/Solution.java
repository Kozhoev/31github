package leedcode.problem13;
import java.util.HashMap;
import java.util.Map;
class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        int ans=0;
        for(int i = 0 ; i<n;i++)
        {
            if(s.charAt(i)=='C')
            {
                if(i<n-1 && s.charAt(i+1)=='M')
                {
                    ans+=900;
                    i++;
                }
                else if(i<n-1 && s.charAt(i+1)=='D')
                {
                    ans+=400;
                    i++;
                }
                else
                {
                    ans+=100;}
            }
            else if(s.charAt(i)=='X')
            {
                if(i<n-1 && s.charAt(i+1)=='C')
                {
                    ans+=90;
                    i++;
                }
                else if(i<n-1 && s.charAt(i+1)=='L')
                {
                    ans+=40;
                    i++;
                }
                else
                {ans+=10;}
            }
            else if(s.charAt(i)=='I')
            {
                if(i<n-1 && s.charAt(i+1)=='X')
                {
                    ans+=9;
                    i++;
                }
                else if(i<n-1 && s.charAt(i+1)=='V')
                {
                    ans+=4;
                    i++;
                }
                else
                {ans+=1;}
            }
            else if(s.charAt(i)=='V')
            {
                ans+=5;
            }
            else if(s.charAt(i)=='L')
            {
                ans+=50;
            }
            else if(s.charAt(i)=='D')
            {
                ans+=500;
            }
            else if(s.charAt(i)=='M')
            {
                ans+=1000;
            }
        }
        return ans;
    }
}
