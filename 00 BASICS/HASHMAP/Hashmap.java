import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*  Java is way more strict with hashmaps compared to Python/Javascript. A Hashmap in Java con only hold key-value pairs with the 
every key being the same dataype as all other keys, same goes for the values. Will discuss two possible alternatives at the bottom.
*/

public class Hashmap {
    public static void main(String[] args) {
        // DECLARATION
        HashMap<String, String> user = new HashMap<>();

        // INITIALIZATION
        HashMap<Integer, String> employees = new HashMap<>(Map.of(
            1, "Peter",
            2, "Julia",
            3, "Monika"
        ));

        // CREATE
        employees.put(4, "Maria");

        // READ
        System.out.println(employees);              // Prints the whole Hashmap
        System.out.println(employees.get(3));       // Prints Value by given Key

        // UPDATE
        employees.put(4, "Tim");                    // Update Value by Key (created if it doesn't exist)

        // ITERATE
        for (Integer key: employees.keySet()) {     // Iterates over the keys only (can access values aswell)
            System.out.println(key + ", " + employees.get(key));
        }

        for (String value: employees.values()) {    // Iterates over the values only
            System.out.println(value);
        }

        // DELETE
        employees.remove(1);                        // Removes Entry by key
        employees.clear();                          // Removes all Entries


        /* Alternatives for different Datatypes:
        1)  Using Type Object, but this creates a rat tail since you can only access the values as Type of Objects.
            So i we want to continue working with the values, we would have to continue with Object type (i.e. List<Object>)

        2)  Using a class instead 
        */
    }
}
