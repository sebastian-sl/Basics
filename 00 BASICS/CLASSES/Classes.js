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


// ENUM example
const department = {                  // ENUM work as class attr
    HR: "HR",
    Finance: "Finance",
    Marketing: "Marketing"
}


// INHERITANCE example
class HREmployee extends Employee {
    constructor(fname, lname, division) {
        super(fname, lname);
        this.division = division;
    }

    department = department.HR;
}

let obj1 = new HREmployee("Zoe", "Miller", "Hiring")    // creating SUBCLASS INSTANCE
console.log(obj1.department)                            // SUBCLASS attr
obj1.intro()                                            // PARENTS INSTANCE method
