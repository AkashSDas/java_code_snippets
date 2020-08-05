public class Main {
    public static void main(String[] args) {
        Student std1 = new Student("James");
        Student std2 = new Student("Ethan");
        Student std3 = new Student("Lane");

        System.out.println(std1.equals(std2));
        System.out.println(std1.compareTo(std2));
        System.out.println(std1);
    }

}

class Student implements Comparable<Student> {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    // To compare instance of this class
    public boolean equals(Student other) {
        if (this.name == other.name) {
            return true;
        } else {
            return false;
        }
    }

    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    public String toString() {
        return this.name;
    }
}
