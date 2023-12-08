package debugging.practice;
public class Practice {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        int result = divide(a, b);

        System.out.println("Result: " + result);
    }

    private static int divide(int a, int b) {
        // Deliberate mistake to cause an ArithmeticException
        return a / b;
    }
}
