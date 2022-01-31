# Strings


# CREATE
mystring = "Hello World"
mystring1 = "Ok lets start!"

# READ
print(mystring)             # prints the whole String

x = mystring[2]             # gets only the 2nd character of the string (remember index starts at 0)
x = mystring[:2]            # gets everything (:) until the 2nd index
x = mystring[2:]            # gets everything from the 2nd index to the end (:)
x = mystring[3:5]           # gets everything from 3rd to 5th index (5th included)
x = mystring[-5:-2]         # same rules apply but backwards, everything from 5th last to 2nd last

# UPDATE (Strings are immutable, so we need to create a new object)
mystring1 = mystring1.replace("k", "kay")       # replaces first with second argument

mystring = mystring.upper()                 # all uppercase
mystring = mystring.lower()                 # all lowercase
mystring = mystring.capitalize()            # capitalizing

mystring = mystring.strip()                 # removes leading and trailing whitespaces

mystring_list = mystring.split(" ")         # Splits the String into a list, separates by given argument

# ITERATE
for i in range(len(mystring)):              # iterate by index with len(string)
    print(i)

for char in mystring:                       # iteration by element
    print(char)

# FORMAT STRING / CONCAT
x = f"{mystring}, {mystring1}"
