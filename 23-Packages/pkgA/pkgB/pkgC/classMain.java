package pkgA.pkgB.pkgC;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import pkgA.A;
import pkgA.IntfA;
import pkgA.pkgB.B;
import pkgA.pkgB.IntfB;

public class classMain {
    public static void main(String[] args) {
          new Gui(); 
    }
    
    public String solve() {
        System.out.println("hello");

        Scanner scanner = new Scanner(System.in)new Scanner(System.in);

        IntfA refIntfA;
        IntfB refIntfB;

        A objA = new A();
        B objB = new B();

        System.out.println("HCF method of class A");
        System.out.print("Enter number 1: ");
        int num1A = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int num2A = scanner.nextInt();
        int resultA = objA.HCF(num1A, num2A);
        System.out.println(resultA);

        System.out.println();

        System.out.println("HCF method of class B");
        System.out.print("Enter number 1: ");
        int num1B = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int num2B = scanner.nextInt();
        System.out.print("Enter number 3: ");
        int num3B = scanner.nextInt();
        int resultB = objB.HCF(num1B, num2B, num3B);
        System.out.println(resultB);

        scanner.close();

        return "Result of A: " + resultA + ", "  + "Result of B: " + resultB;
    }
}

class Gui implements ActionListener {
    Frame frame = new Frame();
    Label label = new Label("Results");
    Button button = new Button("Submit");
    classMain obj;

    Gui() {
        label.setBounds(20, 100, 100, 20);
        button.setBounds(20, 120, 100, 20);
        frame.add(label);
        frame.add(button);
        frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(400, 200);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == button) {
            obj  = new classMain();
            String result = obj.solve();
            System.out.println(new classMain().solve());
            label.setText(result);
        }
    }
}
