package loops.practice;

public class forloop {
    public static void main(String[] args) {
        for (int i = 0; i<5; i++) {
            System.out.println("I love you");
        }
        int i = 0;
//        do {System.out.println("I hate you");
//            i++;
//        } while (i<7);
        int[] arr = {1, 9, 9, 5};
        for (; i < arr.length; i++) {
            int el = arr[i];
            System.out.println(el);
        }
}
}
