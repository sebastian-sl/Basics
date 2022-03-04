/*  Since Java (in contrast to Python/JS) differentiates between lists and array, i will show both ways (Array first, then List).
    The main differences between arrays are:
            -> Arrays have fixed size and are therefor better performance wise
            -> Lists are more flexible and have bit more utility                */
import java.util.*;

public class Array {
  public static void main(String[] args) {

            // DECLARATION
            String[] exampleArray = new String[3];                  // need to give size
            List<String> exampleList = new ArrayList<>();

            // INITIALIZE
            String[] myArray = {"Tim", "Tom", "Zoe"};
            List<String> myList = new ArrayList<>(Arrays.asList("Tim", "Tom", "Zoe"));

            // READ ALL
            System.out.println(Arrays.toString(myArray));       // for whole array
            System.out.println(myList);

            // READ element
            System.out.println(myArray[0]);
            System.out.println(myList.get(0));

            // CREATE
            exampleArray[0] = "Peter";                          // You can't add a new element to an array, because of the fixed size! (see variable name)
            myList.add("Peter");

            // UPDATE
            myArray[0] = "Julia";
            myList.set(0, "Julia");

            // ITERATION BY INDEX
            for (int i = 0; i < myArray.length; i++) {          // For List: myList.size()
                System.out.println(myArray[i]);
                System.out.println(myList.get(i));
            }

            // ITERATION BY ELEMENT                             // same for lists
            for (String name: myArray) {
                System.out.println(name);
            }

            // SORT
            Arrays.sort(myArray);                              // ASC, sort(myArray, Collections.reverseOrder()) for DESC
            Collections.sort(myList);                          // ASC, sort(myList, Collections.reverseOrder()) for DESC

            // REVERSE
            Collections.reverse(Arrays.asList(myArray));        // reversing the order
            Collections.reverse(myList);

            // DELETE element
            myArray[0] = null;                                  // can't remove cause fixed size!
            myList.remove(0);

            // DELETE all
            myArray = null;
            myList.clear();
    }
}
