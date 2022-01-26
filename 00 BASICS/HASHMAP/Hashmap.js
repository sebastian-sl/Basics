/* 	In Javascript there are multiple ways to create a hashmap/dictionary
	like the standard Object notation but since ES6 we can use the Map
	object which i will use in the following code.
	(Source: Mozilla Developer Network) */


// INITIALIZATION (note the array of key-value pairs)
const employee1 = new Map([                    
	["id", 1],
	["name", "Peter"],
	["age", 39]
])

const employee2 = new Map([
    ["id", 2],
    ["name", "Peter"],
    ["age", 27]
])

// CREATE
employee1.set("gender", "m")
employee2.set("gender", "m")

// READ
console.log(employee1)                      // prints the whole map
console.log(employee1.get("name"))          // print the value of given key

// UPDATE
employee1.set("name", "Dieter")             // Update value by key (if key doesnt' exist, will be created)

// ITERATE (many ways to iterate)
for (let key of employee1.keys()) {         // Iterate over the key only
    console.log(key);
}

for (let value of employee1.values()) {     // Iterate over the values only
    console.log(value);
}

for (let entry of employee1) {              // Iterates over the key-value pairs (as array! 0 is key, 1 is value)
    console.log(entry);
    console.log(entry[0]);
}

employee1.forEach(function(value, key) {    // Iterates over key-value pairs, more convenient
    console.log(key, value);
})

// DELETE
employee1.delete("age")                     // removes Item by Key
employee2.clear()                           // clears whole Map