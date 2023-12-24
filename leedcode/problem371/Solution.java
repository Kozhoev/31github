package leedcode.problem371;

class Solution {
    public static int getSum(int a, int b)
    {
        if(b>0)
        {
            for(int i=0;i<b;i++)
            {
                a++;
            }
        }
        else if (b<0)
        {
            for(int i=0;i>b;i--)
            {
                a--;
            }

        }
        return a;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int sum = getSum(a, b);
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);
    }
}



