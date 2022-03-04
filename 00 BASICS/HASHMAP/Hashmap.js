/* 	In Javascript there are multiple ways to create a hashmap/dictionary like the standard Object notation but since 
	ES6 we can use the Map object which i will use in the following code. (Source: Mozilla Developer Network) */

// INITIALIZATION
const employee1 = new Map([                    
	["id", 1],
	["name", "Peter"],
	["age", 39]
])

// READ
console.log(employee1)                      // complete map
console.log(employee1.get("name"))          // value by given key

// CREATE
employee1.set("gender", "m")		    // new key value pair (if key doesn't exist otherwise updated)

// UPDATE
employee1.set("name", "Dieter")

// ITERATE over keys
for (let key of employee1.keys()) {         // Iterate over the key only
    console.log(key);
}

// ITERATE over values
for (let value of employee1.values()) {     // Iterate over the values only
    console.log(value);
}

// ITERATE over elements
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
