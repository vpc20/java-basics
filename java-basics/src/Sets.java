import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    static void main() {

        // HashSet — fastest, no ordering guarantee
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("orange");
        set.add("apple"); // ignored — duplicate
        // {"banana", "apple"} (order unpredictable)
        System.out.println(set);


        // LinkedHashSet — maintains insertion order
        Set<String> set1 = new LinkedHashSet<>();
        set1.add("apple");
        set1.add("banana");
        // {"apple", "banana"} (insertion order preserved)
        System.out.println(set1);


        // TreeSet — sorted (natural order or custom Comparator)
        Set<Integer> set2 = new TreeSet<>();
        set2.add(5);
        set2.add(1);
        set2.add(3);
        // {1, 3, 5} (sorted ascending)
        System.out.println(set2);


        // Common Operations
        set.add("x");          // add element
        set.remove("x");       // remove element
        System.out.println("set contains x: " + set.contains("x"));     // true/false

        System.out.println("size of set: " + set.size());            // number of elements
        System.out.println("set is empty: " + set.isEmpty());         // true/false

        // Iteration
        for (String s : set) {
            System.out.println(s);
        }
        set.forEach(System.out::println);

        set.clear();           // remove all
    }
}
