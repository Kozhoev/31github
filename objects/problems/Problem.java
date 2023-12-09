package objects.problems;

public class Problem {
    class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println("(" + x + "," + y + ")");
    }

    // Your code goes here
    public void scale() {
        x = x/2;
        y = y/2;
    }
}

    public static class Main {
        public static void main(String[] args) {
            Problem problemInstance = new Problem();
            Problem.Point p = problemInstance.new Point(32, 32);
            for (int i = 0; i < 5; i++) {
                p.scale();
                p.print();
            }
        }
    }
}
