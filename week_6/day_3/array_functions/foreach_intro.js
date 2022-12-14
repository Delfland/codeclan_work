const myNumbers = [1,2,3,4];

for (const number of myNumbers) {
    console.log(`Number was: ${number}`);
};

// for each loop with arrow function
const myNumbers2 = [5,6,7,8];

myNumbers2.forEach((element) => {
    console.log(`Number was: ${element}`);
});

// for each passing a function instead of an element
const myNumbers3 = [9,10,11,12];

const myNumberFunction = (element) => {
    console.log(`Number was: ${element}`);
};
myNumbers3.forEach(myNumberFunction)

myNumbers3.forEach((number, index) =>{
    console.log(`Next number was; ${number} at index ${index}`);
});


const myNumberFunction2 = (number, index) =>{
    console.log(`Next number was; ${number} at index ${index}`);
};
myNumbers3.forEach(myNumberFunction2)

const multipliedByTwo = function (numbers) {
    const multipliedNums = [];

    numbers.forEach((number) => {
        const multipliedNum = number * 2;
        multipliedNums.push(multipliedNum);
    });

    return multipliedNums;
}

console.log('numbers after multiplication:', multipliedByTwo(myNumbers2))

const getEvens = function (numbersArray) {
    const evenNums = [];

    numbersArray.forEach((number) => {
        if (number % 2 === 0){
            evenNums.push(number);
        }
    });
    return evenNums;
};

console.log('even numbers are:', getEvens(myNumbers3))