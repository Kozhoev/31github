package debugging.practice;
public class Practice {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        int result = divide(a, b);

        System.out.println("Result: " + result);
    }

    private static int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero!");
            return 0;  // or handle it in a way that makes sense for your application
        }
    }

}

