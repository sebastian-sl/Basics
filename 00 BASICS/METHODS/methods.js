// Methods
mystring = "testString"
myint = 5
myarray = [5, 6, 7]

// FUNCTIONS
function myfunction1() {                // Basic function, can be executed with myfunction1()
    return "Hello World"
}

function myfunction2(number=1) {       // with an argument, equal means default value if no argument given
    return number * number
}

function myfunction3(...numbers) {      // with as many arguments as we want, need to iterate over the results
    for (let num of numbers) {
        console.log(num)
    }
}

function myfunction4({id, num}) {       // with key value pairs as arguments
    console.log(id, num)                // example: myfunction4({id: 1, num: 5})
}

// BUILT IN METHODS
func = (a, b) => a * b;                     // arrow/anonymous function

myarray1 = myarray.map(myfunction2)         // maps a function to an iterable
myarray1 = myarray.map((num) => num * num)  // arrow and mapping together
