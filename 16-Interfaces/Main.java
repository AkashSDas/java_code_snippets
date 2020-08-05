public class Main {
    public static void main(String[] args){
        Car ford = new Car();
        ford.speedUp(10);
        ford.changeGear(2);
        ford.display();

        // Using the static method of interface
        int x = Vehicle.math(5);
        System.out.print(x);
    }
}

class Car implements Vehicle {

    // Using vehicle interface

    private int gear = 1;
    private int speed = 0;

    public void changeGear(int gear) {
        this.gear = gear;
    }

    public void speedUp(int change) {
        this.speed += change;
    }

    public void slowDown(int change) {
        this.speed -= change;
    }

    public void display() {
        System.out.println("I am a car, going " + this.speed + "km/h and I am in gear " + this.gear);
        out();
    }
}

// This is abstract 
interface Vehicle {

    final int gears = 5;

    void speedUp(int a);
    void changeGear(int a);
    void slowDown(int a);

    // This method can be used in all classes that inherit Vehicle class
    // This is not a static method since we have to call this from within
    // the class
    default void out() {
        System.out.println("Default Method");
    }

    // Static method
    static int math(int b) {
        return b + 9;
    }
}
