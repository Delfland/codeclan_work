const getEvens = function (numbers) {
    const result = [];
  
    numbers.forEach((number, index) => {
      if (number % 2 === 0) {
        result.push(number);
      }
    });
  
    return result;
  }
  
  console.log(getEvens(myNumbers));