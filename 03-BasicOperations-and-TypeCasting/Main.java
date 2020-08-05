public class Main {
    public static void main(String[] arg) {
        // Basic Operations and Type Casting

        int x; // Decalaration
        x = 100; // Initialization
        System.out.println(x);

        double operation = x + x - x * x / x % x;
        System.out.println(operation);

        // Division and getting floating result

        // Wrong way
        int a = 7;
        int b = 5;
        int result_1 = a / b;
        System.out.println(String.format("Result of %d / %d is %d", a, b, result_1));

        double result_2 = a / b;
        System.out.println(String.format("Result of %d / %d is %.5f", a, b, result_2));

        // The issue above is that we are trying to divide two integers datatypes,
        // so even though our result is floating value still we'll get integer result
        // For floating result we have to make atleast one of the floating datatypes
        // and then divide them and we'll get a floating result

        // Right way
        int c = 7;
        double d = 5;
        double result_3 = c / d;
        System.out.println(String.format("Result of %d / %.0f is %.5f", c, d, result_3));

        // Power
        double u = 19;
        double w = 17;
        double z = Math.pow(19, 17);
        System.out.println(String.format("%f raised %f is %f", u, w, z));

        // Type Casting
        int m = 17;
        int n = 13;
        double o = m / (double) n;
        System.out.println(o);
    }
}
