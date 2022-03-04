/*  Java is way more strict with hashmaps compared to Python/Javascript. A Hashmap in Java con only hold key-value pairs with the 
every key being the same dataype as all other keys, same goes for the values. Will discuss two possible alternatives at the bottom. 
*/
import java.util.*;

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
        
        // READ
        System.out.println(employees);              // complete Hashmap
        System.out.println(employees.get(3));       // value by given key

        // CREATE
        employees.put(4, "Maria");                  // new key value pair (if key doesn't exist otherwise updated)

        // UPDATE
        employees.put(4, "Tim");

        // ITERATE over keys
        for (Integer key: employees.keySet()) {
            System.out.println(key + ", " + employees.get(key));
        }

        // ITERATE over values
        for (String value: employees.values()) {    // Iterates over the values only
            System.out.println(value);
        }

        // DELETE
        employees.remove(1);                        // Removes Entry by key
        employees.clear();                          // Removes all Entries


        /* Alternatives for different Datatypes:
        1)  Using Type Object, but this creates a rat tail since you can only access the values as Type of Objects. So if we want
            to continue working with the values, we would have to continue with the Object type all the time (for example: List<Object>)
        2)  Using a class instead                                                                                                     */
    }
}
