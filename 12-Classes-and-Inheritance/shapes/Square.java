package Practical4;

// ================================
// Square
// ================================
public class Square extends Rectangle {
    Square() {
        super(10, 10); // Since in sqaure all sides are equal
    }

    Square(double side) {
        super(side, side); // Since in sqaure all sides are equal
    }

    double calArea() {
        return super.calArea();
    }

    // protected void finalize() {
    // System.out.println("** Finalized **" + this);
    //
}
