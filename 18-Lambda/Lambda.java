package Learn;

import java.util.Arrays;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        List<Integer> numsList = Arrays.asList(4, 5, 10, 2, 19);
        numsList.forEach((i) -> System.out.println(i));
    }
}
