import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;

public class String {

    public static void main(String[] args) {

        // CREATE
        String mystring = "Hello World";
        String mystring1 = "Ok, this is cool";

        String mysubstring;
        String[] mystringArray;

        // READ
        System.out.println(mystring);

        mysubstring = mystring.substring(1, 2);      // gets the 2nd index. substring(start, end)
        mysubstring = mystring.substring(0, 2);      // gets everything until the 2nd index
        mysubstring = mystring.substring(2);         // gets everything from the 2nd index to end -> same as substring(2, )
        mysubstring = mystring.substring(3, 5);      // gets everything from 3rd to 5th index (5th not included)


        // UPDATE
        mystring1 = mystring1.replace("k", "kay");  // replaces first with second argument

        mystring = mystring.toUpperCase();                                          // all uppercase
        mystring = mystring.toLowerCase();                                          // all lowercase
        mystring = mystring.substring(0, 1).toUpperCase() + mystring.substring(1);  // sadly no method, so we need to combine substring and toUpperCase

        mystring = mystring.trim();                                                 // removes leading and trailing whitespaces

        mystringArray = mystring.split(" ");                                        // splits the string into a list, separates by given argument

        // ITERATE
        for (int i = 0; i < mystring.length(); i++) {                               // Iterate by index, note the charat to get element
            System.out.println(mystring.charAt(i));
        }

        for (char str: mystring.toCharArray()) {                                    // Iterate by element, note its not a string we get!
            System.out.println(str);
        }

        // F String
        mysubstring = String.format("%s! %s", mystring, mysubstring);               // %s as placeholder and then arguments in order
    }
}
