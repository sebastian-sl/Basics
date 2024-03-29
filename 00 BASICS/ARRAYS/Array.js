// INITIALIZATION
myArray = ["Tim", "Julia", "Hans"];

// READ
console.log(myArray);                           // prints complete Array
console.log(myArray[1])                         // prints one element of the array

// CREATE
myArray.push("Lola");                           // Append to the end of the Array
myArray.splice(1, 0, "Peter");                  // Insert into (Position, Delete Count, Element)

// UPDATE
myArray[0] = "Zoe"                              // Updates Value of Element by Index

// ITERATATION BY INDEX
for (let i = 0; i < myArray.length; i++) {      // Iterate by index
    console.log(myArray[i]);
}

// ITERATION BY ELEMENT
for (let name of myArray) {                     // Iterate by Element
    console.log(name);
}

// SORT
myArray.sort()                                  // ASC, myArray.sort().reverse() for desc

// REVERSE
myArray.reverse()                               // Reverses the order of the Array

// DELETE element
myArray.filter(e => e !== "Julia")              // Remove by Value with Arrow Function
myArray.splice(3, 1)                            // Remove by Index, Delete Count

// DELETE all
myArray.length = 0                              // Removes everything
