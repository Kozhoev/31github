package leedcode.problem1;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = myObj.nextInt();

        boolean c = (n % 3 ==0);
        boolean b = (n % 5 ==0);

        if (c && b) {
            System.out.println("answer is: FizzBuzz");
        }
        else if (c) {
            System.out.println("answer is: Fizz");
        }
        else if (b) {
            System.out.println("answer is: Buzz");
        }
        else {
            System.out.println(n);
        }
    }
}
