public class Calculator {
    public static void main(String args[]) {
        // A
        InterfaceMainA aObj = new InterfaceMainA();
        aObj.solve();

        // B
        InterfaceMainB bObj = new InterfaceMainB();
        bObj.solve();
    }
}

// A.

interface Operations {
    double addition();

    double subtraction();

    double multiplication();
}

class Operationslmp implements Operations {
    final double num1;
    final double num2;

    Operationslmp(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double addition() {
        return this.num1 + this.num2;
    }

    public double subtraction() {
        return this.num1 - this.num2;
    }

    public double multiplication() {
        return this.num1 * this.num2;
    }
}

class InterfaceMainA {
    Operationslmp op1 = new Operationslmp(1, 2);
    Operationslmp op2 = new Operationslmp(1, 2);

    void solve() {
        System.out.println(op1.addition());
        System.out.println(op1.subtraction());
        System.out.println(op1.multiplication());

        System.out.println(op2.addition());
        System.out.println(op2.subtraction());
        System.out.println(op2.multiplication());
    }
}

// B.

interface Operation1 {
    double addition();

    double subtraction();
}

interface Operation2 extends Operation1 {
    double multiplication();

    double division();
}

class Add implements Operation1 {
    final double num1;
    final double num2;

    Add(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double addition() {
        return num1 + num2;
    }

    public double subtraction() {
        return 0.0;
    };
}

class AddSub extends Add {
    AddSub(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public double subtraction() {
        return num1 - num2;
    };
}

class MulAddSub extends AddSub implements Operations {
    MulAddSub(double num1, double num2) {
        super(num1, num2);
    }

    public double multiplication() {
        return num1 * num2;
    }
}

class DivMulAddSub extends MulAddSub {
    DivMulAddSub(double num1, double num2) {
        super(num1, num2);
    }

    public double division() {
        return num1 / num2;
    }
}

class InterfaceMainB {
    Add add = new AddSub(1, 2);
    Operation1 addSub = new AddSub(1, 2);
    MulAddSub divMulAddSub1 = new DivMulAddSub(1, 2);
    // Operation2 divMulAddSub2 = new DivMulAddSub(1, 2); // not possible

    void solve() {
        System.out.println(add.addition());
        System.out.println(add.subtraction());

        System.out.println(addSub.addition());
        System.out.println(addSub.subtraction());

        System.out.println(divMulAddSub1.addition());
        System.out.println(divMulAddSub1.subtraction());
        System.out.println(divMulAddSub1.multiplication());
    }
}
