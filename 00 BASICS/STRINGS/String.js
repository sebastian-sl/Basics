// Strings

// CREATE
let mystring = "Hello World, this is cool"
let mystring1 = "ok lets start!"

// READ
console.log(mystring)

x = mystring.substring(1,2)                         // gets the 2nd index. substring(start, end)
x = mystring.substring(0, 2)                        // gets everything until the 2nd index
x = mystring.substring(2)                           // gets everything from the 2nd index to end -> same as substring(2, )
x = mystring.substring(3, 5)                        // gets everything from 3rd to 5th index (5th not included!)
x = mystring.substring(-4, -2)                      // same rules apply but backwards, everything from 5th last to 2nd last

// UPDATE (Strings are immutable, so creating new objects)
mystring1 = mystring1.replace("k", "kay")       // replaces first with second argument

mystring = mystring.toUpperCase()                           // all uppercase
mystring = mystring.toLowerCase()                           // all lowercase
mystring = mystring[0].toUpperCase() + mystring.substring(1)    // sadly there is no method for that so we need to use two of the presented methods

mystring = mystring.trim()                      // removes leading and trailing whitespaces

mystring_list = mystring.split()                // splits the string into a list, separates by given argument

// ITERATE
for (let i = 0; i < mystring.length; i++) {    // iterate by index
    console.log(mystring[i])
}

for (let char of mystring) {                   // iterate by element
    console.log(char)
}

// F String
x = `${mystring}! ${mystring1}`                // new ES6 way of creating template string. note the `` not quotes ''
x = mystring + "! " + mystring1                // old way, still works too :)
