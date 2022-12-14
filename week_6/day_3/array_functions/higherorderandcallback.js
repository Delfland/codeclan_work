const myForEach = function (array, callback) {
    for (const element of array) {
        callback(element);
    }
}

const numbers = [1,2,3,4]

const myCallback = (element) => {
    console.log(`My element was: ${element}`);
}

myForEach(numbers, myCallback);