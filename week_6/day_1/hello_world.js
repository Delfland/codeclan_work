console.log('Hello world!');

var myNameIs = 'Joe';
console.log('name: ', myNameIs);

myNameIs = 34;
console.log('name: ', myNameIs);

var myNumber = 34.999;
console.log(typeof myNumber);

var myString = 'hello';
console.log(typeof myString);

var mySum = myNumber + 99;
console.log(mySum);

var myString1 = "double quoted string ";
var myString2 = 'single quoted string';
var myString3 = `My string was: ${myString1}`;
var myString4 = myString1 + myString2

console.log(myString3);
console.log(myString4);

var myNullVar = null;
console.log(myNullVar, typeof myNullVar);

myUndefinedVar = undefined;
console.log(myUndefinedVar, typeof myUndefinedVar);

if (1 > 0) {
    console.log('1 is greater than 0');
} else if (1 == 0){
    console.log('1 is equal to 0');
} else {
    console.log('something else!');
}

var myVar;
 if (myVar) {
    console.log('variable has a values');
 } else {
    console.log('variable has no value');
 }

//  && = and in Python
//  || = or in Python
if ((1 + 1 === 2) && (2 + 2 ===4)){
    console.log('was true');
}

if ((1 + 1 === 2) || (2 + 2 ===4)){
    console.log('was true');
}