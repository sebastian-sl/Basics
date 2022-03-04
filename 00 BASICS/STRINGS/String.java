import java.util.*;

public class String {
    public static void main(String[] args) {

        // CREATE
        String mystring = "Hello World";
        String mystring1 = "Ok, this is cool";
        
        String[] mystringArray;

        // READ all
        System.out.println(mystring);

        // READ substring
        String mysubstring = mystring.substring(1, 2);                              // gets only the 2nd character of the string
        mysubstring = mystring.substring(0, 2);                                     // gets everything until the 2nd index (2, or just 2 for everything from 2nd to end)

        // UPDATE
        mystring1 = mystring1.replace("k", "kay");                                  // replaces first with second argument (need to create new string because strings are immutable)

        mystring = mystring.toUpperCase();                                          // all uppercase, mystring.toLowerCase() for lowercase
        mystring = mystring.substring(0, 1).toUpperCase() + mystring.substring(1);  // capitalizing (no built-in method)

        mystring = mystring.trim();                                                 // removes leading and trailing whitespaces

        mystringArray = mystring.split(" ");                                        // splits the string into a list, separates by given argument

        // ITERATE by Index
        for (int i = 0; i < mystring.length(); i++) {                               // Iterate by index, note the charat to get element
            System.out.println(mystring.charAt(i));
        }

        // ITERATE by Element
        for (char str: mystring.toCharArray()) {                                    // NOTE: Elements of a string are characters!
            System.out.println(str);
        }

        // TEMPLATE STRINGS
        mysubstring = String.format("%s! %s", mystring, mysubstring);               // %s as placeholder and then arguments in order
    }
}
