import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        // Arrays

        // String type Fixed array
        String[] arr = new String[5];

        // Adding elements to array
        arr[0] = "James";
        arr[1] = "Ethan";
        arr[2] = "Cain";
        arr[3] = "Tony";
        arr[4] = "Steven";

        // Another way of creating array
        int[] nums = { 1, 2, 3, 4, 5 };
        System.out.println(nums[0]);

        double[] floats = { 123.234, 4321.324 };
        System.out.println(floats[1]);

        // ====================

        // Creating array(of size=10) with random numbers
        System.out.println(Arrays.toString(getRandomNumsArr()));

        // Accepting numbers from user in the runtime
        System.out.println(Arrays.toString(getUserNumsArr()));

        int[] numsArr = { 1, 2, 4, 2, 10, 0, -9 };
        System.out.println(getMin(numsArr));
        System.out.println(getMax(numsArr));

        // 2D array taking input in runtime
        System.out.println(Arrays.toString(get2DArr()));

        SuperArray superArray = new SuperArray();

        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 4, 5, 6 };

        int[] addition = superArray.addition(arr1, arr2);
        superArray.printArr(addition);

        int[] multiplication = superArray.multiplication(arr1, arr2);
        superArray.printArr(multiplication);

        List<int[]> list = superArray.transpose(arr1);
        superArray.printTransposeResult(list);
    }

    // ================================
    // Array of size=10 with random numbers
    // ================================
    static int[] getRandomNumsArr() {
        int[] randomNumsArray = new int[10];
        for (int i = 0; i < 10; i++) {
            // Assigning random number between 0 & 99
            randomNumsArray[i] = ThreadLocalRandom.current().nextInt(0, 100);
        }

        return randomNumsArray;
    }

    // ================================
    // Adding element in array in runtime
    // ================================
    static int[] getUserNumsArr() {
        int[] userNums = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter your num: ");
            userNums[i] = sc.nextInt();
        }
        sc.close();
        return userNums;
    }

    // ================================
    // Getting max element in an array
    // ================================
    static int getMin(int[] numsArr) {
        int _min = numsArr[0];
        for (int i = 1; i < numsArr.length; i++) {
            if (numsArr[i] < _min) {
                _min = numsArr[i];
            }
        }
        return _min;
    }

    // ================================
    // Getting max element in an array
    // ================================
    static int getMax(int[] numsArr) {
        int _max = numsArr[0];
        for (int i = 1; i < numsArr.length; i++) {
            if (numsArr[i] > _max) {
                _max = numsArr[i];
            }
        }
        return _max;
    }

    // ================================
    // Adding element in 2D array in runtime
    // ================================
    static int[][] get2DArr() {
        int rowSize = 10;
        int colSize = 10;
        int[][] arr = new int[rowSize][colSize];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                System.out.print(String.format("Enter row %d column %d value: ", i, j));
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return arr;
    }
}

class SuperArray {

    int[] addition(int[] arr1, int[] arr2) {
        // arr1 & arr2 must be of same length
        int lengthOfArr = arr1.length;
        int[] result = new int[lengthOfArr];

        for (int i = 0; i < lengthOfArr; i++) {
            result[i] = arr1[i] + arr2[i];
        }
        return result;
    }

    int[] multiplication(int[] arr1, int[] arr2) {
        // arr1 & arr2 must be of same length
        int lengthOfArr = arr1.length;
        int[] result = new int[lengthOfArr];

        for (int i = 0; i < lengthOfArr; i++) {
            result[i] = arr1[i] * arr2[i];
        }
        return result;
    }

    List<int[]> transpose(int[] arr) {
        // arr should be 1D
        List<int[]> transpose = new ArrayList<int[]>();
        for (int i = 0; i < arr.length; i++) {
            int[] tmp = { arr[i] };
            transpose.add(i, tmp);
        }
        return transpose;
    }

    // Printing results for addition & multiplication
    void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    void printTransposeResult(List<int[]> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(Arrays.toString(list.get(i)));
        }
    }
}
