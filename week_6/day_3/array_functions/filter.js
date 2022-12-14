// forEach method

// const getEvens = function (numbers) {
//     const result = [];
  
//     numbers.forEach((number, index) => {
//       if (number % 2 === 0) {
//         result.push(number);
//       }
//     });
  
//     return result;
//   }
  
//   console.log(getEvens(numbers));

// Filter method
const getEvens = function (numbersArray) {
    const evenNums = numbersArray.filter((number) => {
        return number % 2 === 0;
    });
    return evenNums
}

const numbers = [1, 2, 3, 4, 5, 6, 7, 8];

console.log('Even numbers:', getEvens(numbers))

const getOdds = function (numbersArray) {
    const oddNumber = numbersArray.filter((number) => {
        return number % 2 !== 0;
    });
    return oddNumber
}

console.log('Odd numbers:', getOdds(numbers))
