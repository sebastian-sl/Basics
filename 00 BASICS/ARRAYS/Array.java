/*  Since Java (in contrast to Python/JS) differentiates between lists and array, i will show both ways (Array first, then List). Main Differences:
    -> Arrays have fixed size and are therefore better performance wise
    -> Lists are more flexible and have bit more utility                                                                                        */

import java.util.*;

public class Array {
  public static void main(String[] args) {

            // DECLARATION
            String[] exampleArray = new String[3];                  // need to give size of array
            List<String> exampleList = new ArrayList<>();

            // INITIALIZE
            String[] myArray = {"Tim", "Tom", "Zoe"};
            List<String> myList = new ArrayList<>(Arrays.asList("Tim", "Tom", "Zoe"));

            // READ ALL
            System.out.println(Arrays.toString(myArray));
            System.out.println(myList);

            // READ element
            System.out.println(myArray[0]);
            System.out.println(myList.get(0));

            // CREATE
            exampleArray[0] = "Peter";                          // can't add new items to an array
            myList.add("Peter");

            // UPDATE
            myArray[0] = "Julia";
            myList.set(0, "Julia");

            // ITERATION BY INDEX
            for (int i = 0; i < myArray.length; i++) {          // For List: i < myList.size()
                System.out.println(myArray[i]);
                System.out.println(myList.get(i));
            }

            // ITERATION BY ELEMENT                             // same for lists
            for (String name: myArray) {
                System.out.println(name);
            }

            // SORT
            Arrays.sort(myArray);                              // ASC, sort(myArray, Collections.reverseOrder()) for desc
            Collections.sort(myList);                          // ASC, sort(myList, Collections.reverseOrder()) for desc

            // REVERSE
            Collections.reverse(Arrays.asList(myArray));        // reversing the order
            Collections.reverse(myList);

            // DELETE element
            myArray[0] = null;                                  // can't remove cause fixed size
            myList.remove(0);                                   // works for index as well as value

            // DELETE all
            myArray = null;                                     // can't completly delete an array
            myList.clear();
    }
}
