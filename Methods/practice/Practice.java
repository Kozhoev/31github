package Methods.practice;

public class Practice {
    public static void main(String[] args) {
        practice(args);
    }
    public static void foo() {
        System.out.println("print this");
    }
    static void practice(String[] args) {
        foo();
    }
}
