function sayHi() {
    console.log('Hello!');
}
sayHi();


// Function declaration
function sayHello(greetingName) {
    return `Hello ${greetingName}!`;
}
var value = sayHello('Delph');
console.log(value);

// passing a default value if no argument supplied
function sayHello(greetingName='World') {
    return `Hello ${greetingName}!`;
}
var value = sayHello();
console.log(value);


// variable should be defined above the functions using them
var value = sayHello('Good day');
console.log(value);
function sayHello(salutation, greetingName='World') {
    return `${salutation} ${greetingName}!`;
}


// first console log is undefined because the variable is declared after rather than before
console.log(myVar);
var myVar = 123;
console.log(myVar);


// Function expression
var add = function addFunction(firstNum, secondNum) {
    return firstNum + secondNum;
}
console.log(add(1, 2));


// anonymous function expression
var addExpression = function (firstNum, secondNum) {
    return firstNum + secondNum;
}
console.log(addExpression(4, 5));


// Arrow function (always anonymous)
var addArrowFunc = (firstNum, secondNum) => {
    return firstNum + secondNum;
}
var result = addArrowFunc(5,2);
console.log(result);


// simplified arrow function
var addArrowFunc = (firstNum, secondNum) => firstNum + secondNum;
var result = addArrowFunc(6,7);
console.log(result);