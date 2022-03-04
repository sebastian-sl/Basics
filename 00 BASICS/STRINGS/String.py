# CREATE
mystring = "Hello World"
mystring1 = "Ok lets start!"

# READ all
print(mystring)                             # prints the whole String

# READ substring
x = mystring[2]                             # gets only the 2nd character of the string
x = mystring[:2]                            # gets everything until the 2nd index (2: for everything from 2nd to end)
x = mystring[-5:-2]                         # backwards, everything from 5th last to 2nd last

# UPDATE
mystring1 = mystring1.replace("k", "kay")   # replaces first with second argument (need to create new string because strings are immutable)

mystring = mystring.upper()                 # all uppercase, mystring.lower() for lowercase
mystring = mystring.capitalize()            # capitalizing

mystring = mystring.strip()                 # removes leading and trailing whitespaces

mystring_list = mystring.split(" ")         # Splits the String into a list, separates by given argument

# ITERATE by Index
for i in range(len(mystring)):
    print(i)

# ITERATE by Element
for char in mystring:
    print(char)

# TEMPLATE STRING
x = f"{mystring}, {mystring1}"
