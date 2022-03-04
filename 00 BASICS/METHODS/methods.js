mystring = "testString"
myint = 5
myarray = [5, 6, 7]

// BASIC FUNCTIONS
function myfunction1() {                // myfunction1() to execute
    return "Hello World"
}

// FUNCTIONS WITH ARGUMENT
function myfunction2(number=1) {       // equal means default value when none is given
    return number * number
}

// FUNCTIONS WITH UNLIMITED ARGUMENTS
function myfunction3(...numbers) {      // need to iterate over the arguments
    for (let num of numbers) {
        console.log(num)
    }
}

// FUNCTIONS WITH KEY-VALUE PAIRS
function myfunction4({id, num}) {
    console.log(id, num)
}

// ARROW FUNCTIONS
myarray1 = myarray.map((num) => num * num)  
