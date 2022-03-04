# BASIC FUNCTIONS
def myfunction1():                       # myfunction1() to execute
    return "Hello World"

# FUNCTIONS WITH ARGUMENT
def myfunction2(number=1):               # equal means default value when none is given 
    return number * number

# FUNCTIONS WITH UNLIMITED ARGUMENTS
def myfunction3(*args):                  # need to iterate over the arguments
    for arg in args:
        print(arg)

# FUNCTIONS WITH KEY-VALUE PAIRS        # arguments will be passed like this: myfunction(id=1, name=Peter)
def myfunction4(**kwargs):
    for key, value in kwargs.items():
        print(key, value)


# LAMBDA FUNCTIONS
func = lambda a,b: a * b                          # lambda/anonymous function
myarray1 = list(map(lambda x: x*x, myarray))       # lambda and mapping together

# SIMULTANEOUS ITERATION
myarray = [5, 6, 7]
myarray1 = [25, 36, 49]

for num, square in zip(myarray, myarray1):
    print(num, square)
