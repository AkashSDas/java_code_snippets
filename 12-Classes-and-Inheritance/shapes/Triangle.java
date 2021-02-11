package Practical4;

// ================================
// Triangle
// ================================
public class Triangle extends Shape {
    double side1;
    double side2;
    double side3;

    Triangle() {
        this.side1 = 10;
        this.side2 = 10;
        this.side3 = 10;
    }

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    double calArea() {
        // Heron's Formula for the area of a triangle is used here

        // Half of parameter
        double hP = (this.side1 + this.side2 + this.side3) / 2;

        // Area
        double area = Math.sqrt(hP * (hP - this.side1) * (hP - this.side2) * (hP - this.side3));
        return area;

        // If area == 0 then no such with the given sides is possible
    }

    // protected void finalize() {
    // System.out.println("** Finalized **" + this);
    //
}
