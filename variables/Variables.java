package variables;

public class Variables {
    public static void main(String[] arg) {
        String s1 = new String("where are you from?");
        String s2 = "where?";
        String s3 = s1 + s2;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

    static class Mymethod {
        public static void main(String[] args) {
            byte zero = 0;
            String output = "W" + zero + "w";
            System.out.println(output);
        }
    }
}

