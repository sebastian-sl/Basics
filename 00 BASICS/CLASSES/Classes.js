// INSTANCE example
class Employee {
    constructor(fname, lname) {
        this.fname = fname;
        this.lname = lname;
    }

    intro() {
        console.log("Hello, i am " + this.fname + " " + this.lname)
    }
}
let obj = new Employee("Peter", "Mayer")    // creating INSTANCE
console.log(obj.fname)                      // INSTANCE attr
obj.intro()                                 // INSTANCE method


// CLASS example
class Engineer {
    static company = "testcompany";

    static intro() {
        console.log(this.company)
    }
}
console.log(Engineer.company)          // CLASS attr
Engineer.intro()                       // CLASS method

// INHERITANCE example
class HREmployee extends Employee {
    constructor(fname, lname, division) {
        super(fname, lname);
        this.division = division;
    }
}
let obj1 = new HREmployee("Zoe", "Miller", "Hiring")    // creating SUBCLASS INSTANCE
obj1.intro()                                            // PARENTS INSTANCE method
