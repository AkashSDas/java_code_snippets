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
