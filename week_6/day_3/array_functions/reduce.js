const numsArray = [1,2,3,4,5]

// const mySummingFunction = function(numbers) {
//     let total =0;

//     for (const number of numbers) {
//         total += number;
//     }
//     return total;
// }

const mySummingFunction = function(array) {
    const total = array.reduce((accumulator, currentElement) => {
        return accumulator + currentElement
    }, 0);
    return total;
};

console.log ('Total was:', mySummingFunction(numsArray))