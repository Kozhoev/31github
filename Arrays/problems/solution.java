package Arrays.problems;

public class solution {
    public static void main(String[] args) {

                int[] numbers = {1, 2, 3};
                int length = numbers[2];
                char[] chars = new char[length];
                chars[numbers.length -2] = 'y';
                System.out.println("Done!");
                for (int i=0; i<chars.length; i++){
                    System.out.println(chars[i]);
                }
    }
}
