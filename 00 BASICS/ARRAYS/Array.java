import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


/* JAVA ARRAYS

In Java there are multiple ways to write Arrays. I will start with the more
accesible/useable way and then show the traditional Array. 

*/


public class Array {
    public static void main(String[] args) {
        
        // DECLARATION
        ArrayList<String> myArray;
        ArrayList<Integer> myArray2;
        ArrayList<Integer> myArray3;

        // INITIALIZATION
        myArray = new ArrayList<>(Arrays.asList("Tim", "Julia", "Hans"));
        myArray2 = new ArrayList<>(Arrays.asList(5, 8, 2));
        myArray3 = new ArrayList<>(Arrays.asList(1, 2, 3));

        // CREATE
        myArray.add(1, "Lola");                             // Insert into specific position
        myArray.add("Peter");                               // Append to the end of the array

        // READ
        System.out.println(myArray);                        // Prints complete Array
        System.out.println(myArray.get(2));                 // Get Element by Index

        // UPDATE
        myArray.set(0, "Zoe");                              // Update Element by Index
                                                            // No Map, probably by Iteration (unsure)
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




        /*                  NORMAL ARRAYS
        Normal Arrays have some minor advantages in some areas (ie. performance) but
        also have some drawbacks which we will se in the following code which tries to
        do the same operations as above. 
        */

        // DECLARATION
        String[] names;

        // INITIALIZATION (easier)
        String[] oldArr = {"Dieter", "Maier"};

        // CREATE
                    // Impossible, Arrays have a fixed size so we can't add new Elements

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

        // SORT
        Arrays.sort(oldArr);                                // SORT ASC
        Arrays.sort(oldArr, Collections.reverseOrder());    // SORT DESC

                    // Reversing not possible, only with Loop

        // DELETE
                    // Impossible to delete single Elements because of the size        
        oldArr = null;
    }
}