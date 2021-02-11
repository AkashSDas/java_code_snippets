import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String args[]) {
        new Calculator();
        // new UserForm();
    }
}

class Calculator implements ActionListener {
    Frame f = new Frame();

    Label firstNumLabel = new Label("First Number");
    Label secondNumLabel = new Label("Second Number");
    Label resultLabel = new Label("Result");

    TextField firstNumTF = new TextField();
    TextField secondNumTF = new TextField();
    TextField resultTF = new TextField();

    Button addBtn = new Button("+");
    Button subBtn = new Button("-");
    Button mulBtn = new Button("*");
    Button divBtn = new Button("/");
    Button cancelBtn = new Button("quit");

    Calculator() {
        firstNumLabel.setBounds(50, 100, 100, 20);
        secondNumLabel.setBounds(50, 140, 100, 20);
        resultLabel.setBounds(50, 180, 100, 20);

        firstNumTF.setBounds(200, 100, 100, 20);
        secondNumTF.setBounds(200, 140, 100, 20);
        resultTF.setBounds(200, 180, 100, 20);

        addBtn.setBounds(50, 250, 50, 20);
        subBtn.setBounds(110, 250, 50, 20);
        mulBtn.setBounds(170, 250, 50, 20);
        divBtn.setBounds(230, 250, 50, 20);
        cancelBtn.setBounds(290, 250, 50, 20);

        f.add(firstNumLabel);
        f.add(secondNumLabel);
        f.add(resultLabel);

        f.add(firstNumTF);
        f.add(secondNumTF);
        f.add(resultTF);

        f.add(addBtn);
        f.add(subBtn);
        f.add(mulBtn);
        f.add(divBtn);
        f.add(cancelBtn);

        addBtn.addActionListener(this);
        subBtn.addActionListener(this);
        mulBtn.addActionListener(this);
        divBtn.addActionListener(this);
        cancelBtn.addActionListener(this);

        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400, 350);
    }

    public void actionPerformed(ActionEvent e) {
        double num1 = Integer.parseInt(firstNumTF.getText());
        double num2 = Integer.parseInt(secondNumTF.getText());

        if (e.getSource() == addBtn) {
            resultTF.setText(String.valueOf(num1 + num2));
        }

        if (e.getSource() == subBtn) {
            resultTF.setText(String.valueOf(num1 - num2));
        }

        if (e.getSource() == mulBtn) {
            resultTF.setText(String.valueOf(num1 * num2));
        }

        if (e.getSource() == divBtn) {
            resultTF.setText(String.valueOf(num1 / num2));
        }

        if (e.getSource() == cancelBtn) {
            System.exit(0);
        }
    }
}

class UserForm implements ActionListener {
    Frame f = new Frame();

    Label name = new Label("Name");
    Label password = new Label("Password");

    TextField nameTF = new TextField();
    TextField passwordTF = new TextField();

    Button submitBtn = new Button("Submit");
    Button quitBtn = new Button("Quit");

    UserForm() {
        name.setBounds(50, 100, 100, 20);
        password.setBounds(50, 140, 100, 20);

        nameTF.setBounds(200, 100, 100, 20);
        passwordTF.setBounds(200, 140, 100, 20);

        submitBtn.setBounds(50, 250, 200, 20);
        quitBtn.setBounds(50, 300, 200, 20);

        f.add(name);
        f.add(password);

        f.add(nameTF);
        f.add(passwordTF);

        f.add(submitBtn);
        f.add(quitBtn);

        submitBtn.addActionListener(this);
        quitBtn.addActionListener(this);

        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400, 350);
    }

    public void actionPerformed(ActionEvent e) {
        String nameValue = nameTF.getText();
        String passwordValue = passwordTF.getText();

        if (e.getSource() == submitBtn) {
            System.out.println(nameValue);
            System.out.println(passwordValue);
        }

        if (e.getSource() == quitBtn) {
            System.exit(0);
        }
    }
}
