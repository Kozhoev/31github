package Methods.practice;

public class Practice {
    public static void main(String[] args) {
        practice(args);
        Practice a = new Practice();
        a.bar(2,3);
    }
    public static void foo() {
        System.out.println("print this");
    }
    static void practice(String[] args) {
        foo();
    }

    public void bar(int num1, int num2){
        int result = num1+num2;
        System.out.println(result);
    }
}
