// CREATE
let mystring = "Hello World, this is cool"
let mystring1 = "ok lets start!"

// READ all
console.log(mystring)

// READ substring
x = mystring.substring(1,2)                                     // gets only the 2nd character of the string
x = mystring.substring(0, 2)                                    // gets everything until the 2nd index (2, or just 2 for everything from 2nd to end)
x = mystring.substring(-4, -2)                                  // backwards, everything from 5th last to 2nd last

// UPDATE
mystring1 = mystring1.replace("k", "kay")                       // replaces first with second argument (need to create new string because strings are immutable)

mystring = mystring.toUpperCase()                               // all uppercase, mystring.toLowerCase() for lowercase
mystring = mystring[0].toUpperCase() + mystring.substring(1)    // capitalizing (no built-in method

mystring = mystring.trim()                                      // removes leading and trailing whitespaces

mystring_list = mystring.split()                                // splits the string into a list, separates by given argument

// ITERATE by Index
for (let i = 0; i < mystring.length; i++) {    // iterate by index
    console.log(mystring[i])
}

// ITERATE by Element
for (let char of mystring) {                   // iterate by element
    console.log(char)
}

// TEMPLATE STRING
x = `${mystring}! ${mystring1}`                // new ES6 way of creating template string. note the `` not quotes ''
x = mystring + "! " + mystring1                // old way, still works too :)
