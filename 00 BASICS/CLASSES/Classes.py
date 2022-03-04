# INSTANCE example
class Employee:
    def __init__(self, fname, lname):
        self.fname = fname
        self.lname = lname

    def intro(self):
        print(f"Hello, i am {self.fname} {self.lname}!")


obj = Employee("Peter", "Mayer")            # creating INSTANCE
print(obj.fname)                            # INSTANCE attr (changeable with obj.fname = ?)
obj.intro()                                 # INSTANCE method


# CLASSES example
class Engineer:
    company = "testcompany"

    @classmethod
    def intro(cls):
        print(f"Hello, i work for {cls.company}")

    @staticmethod
    def give_raise(salary):
        print("NO!")

print(Engineer.company)                    # CLASS attr
Engineer.intro()                           # CLASS method

# INHHERITANCE example
class HR_Employee(Employee):                        # Without init, subclass inherits the init from parents! Super() 'manually'
    def __init__(self, fname, lname, division):     # inherits for given arguments. We do this to add another attr!
        super().__init__(fname, lname)
        self.division = division

obj1 = HR_Employee("Zoe", "Miller", "Hiring")       # creating SUBCLASS INSTANCE
obj1.intro()                                        # PARENTS INSTANCE method
