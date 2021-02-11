public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("James", 10);
        emp1.info();

        Employee emp2 = new Employee("Ethan", 9);
        emp2.info();

        // Getting the age of james
        int james_age = emp1.get_age();
        System.out.println(james_age);

        // Setting the age of james
        emp1.set_age(99);
        int james_new_age = emp1.get_age();
        System.out.println(james_new_age);

        // Manager
        Manager mng1 = new Manager("Lenard", 73, "AI");
        int mng1_age = mng1.get_age();
        System.out.println(mng1_age);
        mng1.set_age(22);
        int mng1_new_age = mng1.get_age();
        System.out.println(mng1_new_age);

        String mng1_dept = mng1.get_department();
        System.out.println(mng1_dept);
        mng1.set_department("ML");
        mng1_dept = mng1.get_department();
        System.out.println(mng1_dept);

        // Using another constructor
        Manager mng2 = new Manager("Frega", 232921);
        int mng2_age = mng2.get_age();
        System.out.println(mng2_age);
        String mng2_dept = mng2.get_department();
        System.out.println(mng2_dept); // null

        Manager mng3 = new Manager("Aakinatim", 12120, "Pharaoh");
        String mng3_dept = mng3.get_department();
        System.out.println(mng3_dept);

        // ==================

        // Employee
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("UFC", 2000);

        System.out.println(emp1.basicSalary);
        System.out.println(emp2.basicSalary);

        System.out.println(emp2.calNetSal());
        System.out.println(emp2.calNetSal(emp2.basicSalary));

        // To test finalize method
        // while (true) {
        // new Employee();
        // }

        // Calculator
        System.out.println(Calculator.inverse(5));
        System.out.println(Calculator.inverse(5.0));

        System.out.println(Calculator.negate(5));
        System.out.println(Calculator.negate(5.0));

        System.out.println(Calculator.root(5));
        System.out.println(Calculator.root(5.0));

        // // To test finalize method
        // while (true) {
        // new Calculator(10, 10.0);
        // }

        // ====================

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
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void info() {
        System.out.println(this.name + " has a age of " + this.age + " years");
    }

    public int get_age() {
        return this.age;
    }

    public void set_age(int age) {
        this.age = age;
    }
}

class Manager extends Employee {

    protected String department;

    public Manager(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    // Another Constructor
    public Manager(String name, int age) {
        super(name, age);
    }

    public String get_department() {
        return this.department;
    }

    public void set_department(String new_department) {
        this.department = new_department;
    }

}

// ================================
// Employee
// ================================
class Employee02 {
    String ecode;
    double basicSalary;

    Employee() {
        this.ecode = "ecode";
        this.basicSalary = 1000;
    }

    Employee(String ecode, double basicSalary) {
        this.ecode = ecode;
        this.basicSalary = basicSalary;
    }

    double calNetSal() {
        double hra = (2 / 100) * this.basicSalary;
        double da = (127 / 100) * this.basicSalary;
        double grossSalary = this.basicSalary + hra + da;
        double pf = (5 / 100) * grossSalary;

        double netSalary = grossSalary - pf;
        return netSalary;
    }

    double calNetSal(double basicSalary) {
        double hra = (2 / 100) * basicSalary;
        double da = (127 / 100) * basicSalary;
        double grossSalary = basicSalary + hra + da;
        double pf = (5 / 100) * grossSalary;

        double netSalary = grossSalary - pf;
        return netSalary;
    }

    // protected void finalize() {
    // System.out.println("** Finalized **" + this);
    // }
}

// ================================
// Calculator
// ================================
class Calculator {
    int num1;
    double num2;

    Calculator(int num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    static double inverse(int num) {
        return 1 / (double) num;
    }

    static double inverse(double num) {
        return 1 / num;
    }

    static int negate(int num) {
        return Math.negateExact(num);
    }

    static double negate(double num) {
        return Math.negateExact((int) num);
    }

    static int root(int num) {
        return (int) Math.sqrt((double) num);
    }

    static double root(double num) {
        return Math.sqrt(num);
    }

    int add() {
        return this.num1 + (int) this.num2;
    }

    double multiply() {
        return this.num1 * this.num2;
    }

    // protected void finalize() {
    // System.out.println("** Finalized **" + this);
    // }
}

// ================================
// Shape
// ================================
abstract class Shape {
    abstract double calArea();
}

// ================================
// Triangle
// ================================
class Triangle extends Shape {
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

// ================================
// Rectangle
// ================================
class Rectangle extends Shape {
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

// ================================
// Square
// ================================
class Square extends Rectangle {
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
