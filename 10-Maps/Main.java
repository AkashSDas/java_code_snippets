import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

// import java.util.HashMap;
// import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // Hashmap - It doesn't retained it's order (order is not not garunteed)
        Map m = new HashMap();

        // Adding value to map
        m.put("age", 5); // (key, value)

        System.out.println(m);

        // Getting values of using key
        System.out.println(m.get("age"));

        // The above map has no type checking therefore we might get some warinings

        // Fruits name as key and number as values
        Map<String, Integer> fruits = new HashMap<String, Integer>();
        fruits.put("apple", 10);
        fruits.put("pineapple", 7);
        fruits.put("mango", 300000);
        fruits.put("banana", 9);

        System.out.println(fruits);

        // HashMap is very fast since it doesn't looks at the order

        // TreeMap - Here our keys, values are ordered
        // Keys should be of same datatype and values of should be of same datatype
        // but keys and values can be of different datatype

        Map t = new TreeMap();
        t.put("apple", 10);
        t.put("pineapple", 7);
        t.put("mango", 300000);
        t.put("banana", 9);

        System.out.println(t);

        // LinkedHashMap - It keeps things in the same order as they were added
        Map l = new LinkedHashMap();
        l.put("apple", 10);
        l.put("pineapple", 7);
        l.put("mango", 300000);
        l.put("banana", 9);

        System.out.println(l);

        // Methods of Map

        // To check if values exists or not
        l.containsValue(300000); // returns true or false
        l.containsKey("mango"); // returns true or false

        System.out.println(l.containsValue(300000));

        l.get(l.containsKey("mango"));
        // If try to get from key that doesn't exists in map then it will returns null

        System.out.println(l.containsKey("Does not exists"));

        // isEmpty to check if the map is empty or not
        l.isEmpty();

        // clear method will remove everything
        l.clear();
    }
}
