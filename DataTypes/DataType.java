package DataTypes;

public class DataType {
    public static void main(String[] args) {
        boolean b = false;
        b = true;

        boolean toBe = false;
        b = toBe || !toBe;
        if (b) {
            System.out.println(toBe);
        }

        int children = 0;
        b = children; // Will not work
        if (children) { // Will not work
            // Will not work
        }

        int a;
        boolean b = true;
        boolean c = false;
        a = b + c;            //The following line will give an error
        System.out.println(a);
    }
}
