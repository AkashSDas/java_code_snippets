import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println(new HandleZeroDivision(10, 0).division());

        new HandleAny2Exception().getFileData("unknownFile.txt");

        new NestedTryCatch().getFileData("unknownFile.txt");

        try {
            throw new UserDefinedException("Copied");
        } catch (UserDefinedException e) {
            System.out.println("Get's the job done");
        }

        // getFileData("./file.txt");
        // getNumDataFromFile("./file.txt");
    }

    // ========================
    // Question 1
    // ========================
    static void getFileData(String fileName) {
        try {
            try {
                FileReader f = new FileReader(fileName);
                try {
                    int i;
                    while ((i = f.read()) != -1) {
                        System.out.print((char) i);
                    }
                } catch (IOException e) {
                    System.out.println("😨 I/O error, Please try again...");
                }
            } catch (FileNotFoundException e) {
                System.out.println("📂 File cannot be found");
            }
        } catch (Exception e) {
            System.out.println("🎁 Some unknown error has arrived");
        }
    }

    // ========================
    // Question 2
    // ========================
    static boolean checkNum(char c) {
        int[] nums = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == ((int) c - '0')) {
                return true;
            }
        }
        return false;
    }

    static void getNumDataFromFile(String fileName) {
        try {
            try {
                FileReader f = new FileReader(fileName);
                FileOutputStream fileOutputStream = new FileOutputStream("./copy.txt");
                int i;
                while ((i = f.read()) != -1) {
                    if (checkNum((char) i)) {
                        fileOutputStream.write((char) i);
                    }
                }
                fileOutputStream.close();
            } catch (FileNotFoundException e) {
                System.out.println("📂 File cannot be found");
            } catch (IOException e) {
                System.out.println("😨 I/O error, Please try again...");
            } finally {
                // fileOutputStream.close();
            }
        } catch (Exception e) {
            System.out.println("🎁 Some unknown error has arrived");
        }
    }
}

// If num1 & num2 are int then you will implicitly get ArithmeticException
// for zero division, in float dtype you get Infinity, so here
// ArithmeticException is explicity thrown
class HandleZeroDivision {
    float num1;
    float num2;
    float result = -1;

    HandleZeroDivision(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public float division() {
        try {
            if (this.num2 == 0) {
                throw new ArithmeticException();
            }
            this.result = this.num1 / this.num2;
        } catch (ArithmeticException e) {
            System.out.println("👊 Division by zero cannot be done");
        }

        return this.result;
    }
}

class HandleAny2Exception {
    public void getFileData(String fileName) {
        try {
            FileReader f = new FileReader(fileName);
            int i;
            while ((i = f.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            System.out.println("📂 File cannot be found");
        } catch (IOException e) {
            System.out.println("😨 I/O error, Please try again...");
        } catch (Exception e) {
            System.out.println("🎁 Some unknown error has arrived");
        }

    }
}

class NestedTryCatch {
    public void getFileData(String fileName) {
        try {
            try {
                FileReader f = new FileReader(fileName);
                try {
                    int i;
                    while ((i = f.read()) != -1) {
                        System.out.print((char) i);
                    }
                } catch (IOException e) {
                    System.out.println("😨 I/O error, Please try again...");
                }
            } catch (FileNotFoundException e) {
                System.out.println("📂 File cannot be found");
            }
        } catch (Exception e) {
            System.out.println("🎁 Some unknown error has arrived");
        }

    }
}

class UserDefinedException extends Exception {
    public UserDefinedException(String anything) {
        super(anything);
    }
}
