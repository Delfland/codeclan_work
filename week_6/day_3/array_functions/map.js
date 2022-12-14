const myNumbers = [1, 2, 3, 4];

const multipliedByTwo = function (numbers) {
    const multipliedNums = [];

    numbers.forEach((number) => {
        const multipliedNum = number * 2;
        multipliedNums.push(multipliedNum);
    });

    return multipliedNums;
}

console.log('numbers after multiplication:', multipliedByTwo(myNumbers));

// same function using map (map retains values from array)
const myNumbers2 = [5, 6, 7, 8];

const multipliedByTwo2 = function (numsArray) {
    return numsArray.map((number) => number * 2);
};

console.log('Multiplied nums:', multipliedByTwo2(myNumbers2));

// map and filter
const array = [
    {
      name: "Joe",
      age: 17,
    },
    {
      name: "Bob",
      age: 17,
    },
    {
      name: "Carl",
      age: 35,
    },
  ];
  const unique = array
    .map((item) => item.age)
    .filter((value, index, self) => self.indexOf(value) === index);
  
  console.log(unique);