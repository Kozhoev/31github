package objects.practice;

public class Objects {
    class Point {
        int x;
        int y;
        Point() {
            this(0, 0);
        }

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        void printPoint() {
            System.out.println("(" + x + "," + y + ")");
        }

        Point center(Point other) {

            return new Point((x + other.x) / 2, (y + other.y) / 2);
        }
    }
    public static void main(String[] args) {
        Objects p = new Objects();

        Point k = p.new Point();

        Point n = p.new Point(3,3);
        Point m = p.new Point(1,9);

        System.out.println("Coordinates of myPoint:");
        k.printPoint();

        Point customPoint = p.new Point(1, 9);

        System.out.println("Coordinates of customPoint:");
        customPoint.printPoint();

        Point centerPoint = n.center(m);
        System.out.println("Center point between point1 and point2:");
        centerPoint.printPoint();
    }
}
