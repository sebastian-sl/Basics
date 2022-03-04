public class methods {

    // BASIC FUNCTIONS
    static String myfunction1() {                                   // myfunction1() to execute
        return "Hello World";
    }

    FUNCTION WITH ARGUMENT
    static Integer myfunction2(Integer num) {return num * num;}     // We can't set default values for arguments, so we need to 'overload' the method,
   
    static Integer myfunction2() { return 2 * 2; }                  // so we create two function: one without arguments and one with (same name)

    static void myfunction3 (String  ...args) {                     // with as many arguments as we want, need to iterate/index
        for (String a: args) {
            System.out.println(a);
        }
    }
}
