import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // *** Sets and Lists ***

        // HashSet
        Set<Integer> s = new HashSet<Integer>();
        s.add(2);
        s.add(9);
        s.add(-1);
        s.add(9);
        s.add(-39);
        System.out.println(s);

        // To seeing if set contains element we are using the "contains" method
        System.out.println(s.contains(2));

        // To remove elements from the set we are using the "remove" method
        System.out.println(s.remove(2));
        System.out.println(s);

        // To see length of the set
        System.out.println(s.size());

        // To see if the set is empty or not
        System.out.println(s.isEmpty());

        // To clear the entire set
        s.clear();
        System.out.println(s);

        // ==========================
        // TreeSet

        // In this the data is stored in the tree
        // We cannot do indexing
        // It gives a ordered set

        Set<Integer> t = new TreeSet<Integer>();
        t.add(2);
        t.add(9);
        t.add(-1);
        t.add(9);
        t.add(-39);
        System.out.println(t);

        // To seeing if set contains element we are using the "contains" method
        System.out.println(t.contains(2));

        // To remove elements from the set we are using the "remove" method
        System.out.println(t.remove(2));
        System.out.println(t);

        // To see length of the set
        System.out.println(t.size());

        // To see if the set is empty or not
        System.out.println(t.isEmpty());

        // To clear the entire set
        t.clear();
        System.out.println(t);

        // ==========================
        // LinkedHashSet

        // These hash set are faster in some operations

        Set<Integer> l = new LinkedHashSet<Integer>();
        l.add(2);
        l.add(9);
        l.add(-1);
        l.add(9);
        l.add(-39);
        System.out.println(l);

        // To seeing if set contains element we are using the "contains" method
        System.out.println(l.contains(2));

        // To remove elements from the set we are using the "remove" method
        System.out.println(l.remove(2));
        System.out.println(l);

        // To see length of the set
        System.out.println(l.size());

        // To see if the set is empty or not
        System.out.println(l.isEmpty());

        // To clear the entire set
        l.clear();
        System.out.println(l);

        // ========================
        // ArrayList

        // These are like arrays but just slower and dynamic in size

        ArrayList<Integer> list = new ArrayList<Integer>();

        // To add element
        list.add(12);
        list.add(1);
        list.add(99);
        list.add(18);
        list.add(2132);

        // To get element in index
        list.get(0); // We pass the index

        // To set something
        list.set(1, 5); // (index, element)

        list.size();

        list.isEmpty();

        // Slicing of list, to get element from this idex to some other index
        ArrayList<Integer> sliced_list = new ArrayList<Integer>(list.subList(0, 3));

        System.out.println(sliced_list);
        System.out.println(list);
        // ==============
        // LinkedList

        // These are like arrays but just slower and dynamic in size

        LinkedList<Integer> linked_list = new LinkedList<Integer>();

        // To add element
        linked_list.add(12);
        linked_list.add(1);
        linked_list.add(99);
        linked_list.add(18);
        linked_list.add(2132);

        // To get element in index
        linked_list.get(0); // We pass the index

        // To set something
        linked_list.set(1, 5); // (index, element)

        linked_list.size();

        linked_list.isEmpty();

        // Slicing of list, to get element from this idex to some other index
        LinkedList<Integer> sliced_linked_list = new LinkedList<Integer>(linked_list.subList(0, 3));

        System.out.println(sliced_linked_list);
        System.out.println(linked_list);
    }
}
