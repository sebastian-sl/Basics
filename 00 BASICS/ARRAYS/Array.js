// JAVASCRIPT ARRAYS

// INITIALIZATION
myArray = ["Tim", "Julia", "Hans"];
myArray2 = [5, 8, 2];

// CREATE
myArray.push("Lola");                           // Append to the end of the Array
myArray.splice(1, 0, "Peter");                  // Insert into Position, Delete Count, Element

// READ
console.log(myArray);                           // Prints complete Array
console.log(myArray[1])                         // Prints the Element with Index

// UPDATE
myArray[0] = "Zoe"                              // Updates Element by Index
myArray2 = myArray2.map((e) => e+e)             // Maps function to all Elements with Arrow (forEach works aswell but doesn't create new array)
myArray3 = myArray.concat(myArray2)             // Joins two Arrays

// ITERATE
for (let i = 0; i < myArray.length; i++) {      // Iterate by index
    console.log(myArray[i]);
}

for (let name of myArray) {                     // Iterate by Element
    console.log(name);
}

// SORT
myArray.sort()                                  // SORT ASC
myArray.sort().reverse()                        // SORT DESC

myArray.reverse()                               // Reverses the order of the Array

// DELETE
myArray.pop()                       // Removes last Element
myArray.filter(e => e !== "Julia")  // Remove by Value with Arrow Function
myArray.splice(3, 1)                // Remove by Index, Delete Count
myArray.length = 0                  // Removes everything
