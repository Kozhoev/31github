package loops.practice;

public class Continue {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 5; i++) {
            if (i >= 3) {
                break;
            }
            System.out.println("who");
            if (i >= 1) {
                continue;
            }
            System.out.println("Auch");
        }
        System.out.println("auch who");
    }
}
