# Methods
mystring = "teststring"
myint = 5
myarray = [5, 6, 7]


# Usage of functions
def myfunction1():                       # Basic function, can be executed with myfunction(). Returns the value, so it can be passed!
    return "Hello World"

def myfunction2(number=1):             # with argument an argument, equals means default value if no argument given
    return number * number

def myfunction3(*args):                  # with as many arguments as we want, need to iterate over the result in the function
    for arg in args:
        print(arg)

def myfunction4(**kwargs):               # with key-value pairs as arguments, need to iterate over as in a dict
    for key, value in kwargs.items():   # arguments will be passed like this: myfunction(id=1, name=Peter).
        print(key, value)               # You cant pass a dict as kwargs!


# BUILT-IN METHODS
myinput = input("Please input a number: ")      # gets input of user! Note: will be a string, so remember converting

func = lambda a,b: a * b                          # lambda/anonymous function

myarray1 = list(map(myfunction2, myarray))         # maps a function to an iterable, returns map object so we convert to list()
myarray1 = list(map(lambda x: x*x, myarray))       # lambda and mapping together

x = ord("A")                                        # returns the unicode code point value of given character (here: 65)
x = chr(65)                                         # returns the string of the unicode code point (here: "A")

result = list(zip(myarray, myarray1))               # Parallel iteration over two iterables
for num, square in zip(myarray, myarray1):          # returns a zip object, so needs to be converted
    print(num, square)                              # here: 5 25, 6 36, 7 49
