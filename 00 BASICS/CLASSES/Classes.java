// INSTANCE example
class Employee {
    String fname, lname;                                    // INSTANCE attr declaration

    Employee(String fname, String lname) {                  // INSTANCE attr
        this.fname = fname;
        this.lname = lname;
    }

    void intro() {                                          // INSTANCE method
        System.out.println("Hello, i am " + this.lname);
    }
}


// CLASS example
class Engineer {
    static String company = "testcompany";              // CLASS attr

    static void intro() {                               // CLASS method
        System.out.println("Hello, i work for " + company);
    }

    static void give_raise(Integer salary) {            // STATIC method
        System.out.println("NO!");
    }
}

// INHERITANCE
class HREmployee extends Employee {
    String division;

    HREmployee(String fname, String lname, String division) {  // SUBCLASS inherits attr from parent
        super(fname, lname);                                   // and adds new attr (division)
        this.division = division;
    }

}

// ACCESSING
public class Classes {
    public static void main(String[] args) {

        // INSTANCE
        Employee employee = new Employee("Peter", "Mayer");         // creating INSTANCE
        System.out.println(employee.fname);                         // getting INSTANCE attr
        employee.intro();                                           // calling INSTANCE method

        // CLASS
        System.out.println(Engineer.company);                       // getting CLASS attr
        Engineer.intro();                                           // calling CLASS method

        // INHERITANCE
        HREmployee hr = new HREmployee("Zoe", "Miller", "Hiring");  // creating INSTANCE SUBCLASS
        hr.intro();                                                 // calling parents INHERITED method
    }
}
