import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        // Creation
        HashSet<Integer> set = new HashSet<>();

        // Insertion
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // Search - contains
        if (set.contains(1)) {
            System.out.println("Set contains 1");
        }
        if (!set.contains(7)) {
            System.out.println("Does not contain 7");
        }

        // Delete
        set.remove(1);
        if (!set.contains(1)) {
            System.out.println("We deleted 1");
        }

        // Print all elements
        System.out.println(set);

        // Iterator
        Iterator it = set.iterator();
        // hashNext
        while (it.hasNext()) {
            System.out.print(".........." + it.next());
        }

        // size
        System.out.println("Size of the set is : " + set.size());
    }
}