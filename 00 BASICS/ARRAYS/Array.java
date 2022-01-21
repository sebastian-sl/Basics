import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// JAVA ARRAY

public class Array {
    public static void main(String[] args) {
        
        // INITIALIZATION
        ArrayList<String> myArray = new ArrayList<>(Arrays.asList("Tim", "Julia", "Hans"));
        ArrayList<Integer>myArray2 = new ArrayList<>(Arrays.asList(5, 8, 2));
        ArrayList<Integer> myArray3 = new ArrayList<>(Arrays.asList(1, 2, 3));

        // CREATE
        myArray.add(1, "Lola");                             // Insert into specific position
        myArray.add("Peter");                               // Append to the end of the array

        // READ
        System.out.println(myArray);                        // Prints complete Array
        System.out.println(myArray.get(2));                 // Get Element by Index

        // UPDATE
        myArray.set(0, "Zoe");                              // Update Element by Index
        myArray2.addAll(myArray3);                          // Joins two Arrays
        
        // ITERATION
        for (int i = 0; i < myArray.size(); i++) {          // Iterate by index
            System.out.println(myArray.get(i));
        }

        for (String name: myArray) {                        // Iterate by Element
            System.out.println(name);
        }

        // SORT
        Collections.sort(myArray);                              // SORT ASC
        Collections.sort(myArray, Collections.reverseOrder());  // SORT DESC
        Collections.reverse(myArray);                           // Reverse order of Array

        // DELETE
        myArray.clear();


        /* NORMAL ARRAYS
        Normal Arrays have some minor advantages in some areas (ie. performance) but also have some 
        drawbacks which we will see in the following code with the same operations as above. */

        // INITIALIZATION (easier)
        String[] oldArr = {"Dieter", "Maier"};

        // CREATE (Impossible to create new Elements because of fixed size)

        // READ
        System.out.println(oldArr[0]);                      // Prints Element by index
        System.out.println(Arrays.toString(oldArr));        // Prints complete Array

        // UPDATE
        oldArr[0] = "Peter";                                // Update ELement by Index

        // ITERATE
        for (int i = 0; i < oldArr.length; i++) {           // Iterate by Index
            System.out.println(oldArr[i]);
        }

        for (String name: oldArr) {                         // Iterate by Element
            System.out.println(name);
        }

        // SORT (Reversing probably not possible, only with Loop)
        Arrays.sort(oldArr);                                // SORT ASC
        Arrays.sort(oldArr, Collections.reverseOrder());    // SORT DESC

        // DELETE (impossible to delete single Elements cause of fixed size)
        oldArr = null;                                      // Removes everything
    }
}