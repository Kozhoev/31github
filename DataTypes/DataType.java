package DataTypes;

public class DataType {
    public static void main(String[] args) {
        boolean b = true;

        boolean toBe = false;
        b = toBe || !toBe;
        if (b) {
            System.out.println(toBe);
        }

        int children = 0;
        // Fix the condition in the if statement
        if (children > 0) {
            // Code to execute if children is greater than 0
        }

        int a;
        boolean c = false; // Different variable name
        a = b ? 1 : 0;     // Use ternary operator or any other logical operation
        System.out.println(a);
    }
}

