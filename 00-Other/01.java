package Practicals;

class Main {
    public static void main(String[] args) {
        int num = 19;
        boolean isPrime = checkPrime(num);
        if (isPrime) {
            System.out.println(String.format("%d is a prime number", num));
        } else {
            System.out.println(String.format("%d is not a prime number", num));
        }

        int num = 153;
        boolean isArmStrong = checkArmstrong(num);
        if (isArmStrong) {
            System.out.println(String.format("%d is a armstrong number", num));
        } else {
            System.out.println(String.format("%d is not a armstrong number", num));
        }

        int num = 121;
        boolean isPalindromic = checkPalindromic(num);
        if (isPalindromic) {
            System.out.println(String.format("%d is a palindromic number", num));
        } else {
            System.out.println(String.format("%d is not a palindromic number", num));
        }
    }

    // ================================
    // Check whether a number is prime
    // ================================
    static boolean checkPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // ================================
    // Check whether a number is armstrong number
    // ================================
    static boolean checkArmstrong(int num) {
        int[] numsList = getNumsList(num);
        int sumOfCubes = getSumOfCubes(numsList);
        return sumOfCubes == num;
    }

    static int[] getNumsList(int num) {
        String numAsStr = Integer.toString(num);
        int[] numsList = new int[numAsStr.length()];

        for (int i = 0; i < numAsStr.length(); i++) {
            numsList[i] = numAsStr.charAt(i) - '0'; // To convert character to int
        }
        return numsList;
    }

    static int getSumOfCubes(int[] numsList) {
        int sum = 0;
        for (int i = 0; i < numsList.length; i++) {
            sum = sum + (numsList[i] * numsList[i] * numsList[i]);
        }
        return sum;
    }

    // ================================
    // Check whether a number is Palindromic number
    // ================================
    static boolean checkPalindromic(int num) {
        String originalNumAsStr = Integer.toString(num);
        int numLength = originalNumAsStr.length();

        int[] originalNumsList = new int[numLength];
        int[] reverseNumsList = new int[numLength];

        // Putting digit's of nums in a list
        for (int i = 0; i < numLength; i++) {
            originalNumsList[i] = originalNumAsStr.charAt(i) - '0';
        }

        // Putting digit's of nums in a list in reverse order
        for (int i = numLength - 1; i >= 0; i--) {
            reverseNumsList[numLength - i - 1] = originalNumAsStr.charAt(i) - '0';
        }

        // Checking palindrom condition
        for (int i = 0; i < numLength; i++) {
            if (originalNumsList[i] != reverseNumsList[i]) {
                return false;
            }
        }
        return true;
    }
}
