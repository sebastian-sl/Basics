const fs = require("fs").promises;

// Path to create json
const fp = process.cwd() + "\\json\\data_javascript.json";


const main = async () => {

// Example Data
my_map = new Map([
    ["id", 1],
    ["first_name", "Hans"],
    ["last_name", "Gruber"],
    ["age", 48],
    ["nationality", "german"]
])


// Load as Json
const obj = Object.fromEntries(my_map)

// Dump to file (converting to string first)
var data = JSON.stringify(obj, null, 4)
await fs.writeFile(fp, data, "utf-8")

// load from file
var data = await require(fp)
console.log(data)

}

main()
