package Practicals;

import java.util.Arrays;

class Main {

    public static void main(String[] args) {
        int factorial = getfactorial(3);
        System.out.println(factorial);

        int hcf = getHCF(184, 230, 276);
        System.out.println(hcf);

        int hcf = getHCF(7, 14, 28);
        System.out.println(hcf);

        int lcm = getLCM(12, 15, 20);
        int lcm = getLCM(7, 13, 29);
        System.out.println(lcm);

        int[] fibSeries = getFibonacci(10);
        System.out.println(Arrays.toString(fibSeries));
    }

    // ================================
    // Factorial
    // ================================
    static int getfactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * getfactorial(num - 1);
    }

    // ================================
    // Highest common factor
    // ================================
    static int getHCF(int num1, int num2, int num3) {
        int hcf = 1;
        int bigNum = (num1 > num2) ? num1 : num2;

        // Getting the hcf for num1 & num2
        for (int i = 1; i < bigNum; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }

        if (num3 % hcf == 0) {
            return hcf;
        }
        return 1;
    }

    // ================================
    // Least common multiple
    // ================================
    static int getLCM(int num1, int num2, int num3) {
        int lcm = 0;
        int limit = 10000;

        // This will give LCM if LCM is < limit
        for (int i = 1; i <= limit; i++) {
            if (i != num1 || i != num2 || i != num3) {
                if (i % num1 == 0 && i % num2 == 0 && i % num3 == 0) {
                    lcm = i;
                    return lcm;
                }
            }
        }
        return lcm;
    }

    // ================================
    // Fibonacci series
    // ================================
    static int[] getFibonacci(int num) {
        int[] series = new int[num + 1];
        series[0] = 0;
        series[1] = 1;
        for (int i = 2; i <= num; i++) {
            series[i] = series[i - 1] + series[i - 2];
        }
        return series;
    }
}
