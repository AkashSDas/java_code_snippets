package Practical4;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10, 20, 20);
        System.out.println(triangle.calArea());

        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println(rectangle.calArea());

        Square square = new Square(10);
        System.out.println(square.calArea());

        // We can't create object of abstract class, but we can create
        // it's reference

        // Creating reference of Shape class
        Shape shape;
        shape = square;
        // Invoking calArea of sqaure class using shape as reference
        System.out.println(shape.calArea());

        double side = 10;
        Rectangle rect = new Rectangle(side, side);
        if (rect.isSquare()) {
            System.out.println(new Square(side).calArea());
        } else {
            System.out.println(rect.calArea());
        }

    }

    // protected void finalize() {
    // System.out.println("** Finalized **" + this);
}
