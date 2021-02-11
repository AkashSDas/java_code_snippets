package Practical4;

// ================================
// Rectangle
// ================================
public class Rectangle extends Shape {
    double height;
    double width;

    Rectangle() {
        this.height = 10;
        this.width = 10;
    }

    Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    double calArea() {
        return this.height * this.width; // Area
    }

    boolean isSquare() {
        return this.height == this.width;
    }

    // protected void finalize() {
    // System.out.println("** Finalized **" + this);
    //
}
