import java.util.Scanner;

public class methods {

    // FUNCTIONS
    static String myfunction1() {                                   // Basic function, can be executed with myfunction1()
        return "Hello World";
    }

    static Integer myfunction2() { return 2 * 2; }                  // Basic function with argument. Since there are no default parameters
    static Integer myfunction2(Integer num) {return num * num;}     // we need to do 'method-overloading by creating two functions (1 with args)'

    static void myfunction3 (String  ...args) {                     // with as many arguments as we want, need to iterate/index
        for (String a: args) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {

        BUILT IN METHODS
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

    }
}
