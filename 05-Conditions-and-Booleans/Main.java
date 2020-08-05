public class Main {
    public static void main(String[] args) {
        // Conditions and Booleans

        int x = 1;
        int y = 2;
        int z = 3;

        // > < >= <= == !=
        boolean compare = x > y;
        System.out.println(compare);

        compare = z <= y;
        System.out.println(compare);

        String str1 = "Hello";
        String str2 = "hello";
        boolean compare_str = str1 == str2; // Not so good way
        System.out.println(compare_str);
        compare_str = str1.equals(str2); // Good way
        System.out.println(compare_str);

        // && ==> And operator
        compare = (z <= y) && (x > z);
        System.out.println(compare);

        // || ==> Or operator
        compare = (z <= y) || (x < z);
        System.out.println(compare);

        // ! ==> Not operator
        compare = (z <= y) || !(x < z);
        System.out.println(compare);
    }
}
