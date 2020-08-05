public class Main {
    public static void main(String[] args) {

        OuterClass out = new OuterClass();
        out.inner();

        // Getting the InnerClass directly
        OuterClass.InnerClass in = out.new InnerClass();
        in.display();

    }
}


class OuterClass {

    public class InnerClass {
        public void display() {
            System.out.println("This is an inner class");
        }
    }

    public void inner() {
        InnerClass in = new InnerClass();
        in.display();
    }
}
