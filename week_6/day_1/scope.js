// var secretsFunction = function () {
//     var pinCode = [0, 0, 0, 0];
//     console.log('pincode inside function: ', pinCode);
// }
// secretsFunction();
// console.log(pinCode);
//
// Code can't run
// the var means that pincode is limited to the scope of the function where it is called
// calling the variable outside the function will return undefined

// let filterNamesByFirstLetter = function (name, letter) {
//     var filteredNames = [];
//     for (let name of names) {
//         if (name[0] === letter) {
//         filteredNames.push(name);
//         }
//     }
//     console.log('name is now: ', name)
//     return filteredNames;
    
// }

// var students = ['Alice', 'Bob', 'Arthur', 'Jane'];
// var filteredStudents = filterNamesByFirstLetter(students, 'A');
// console.log(filteredStudents);

var userName = 'Bill';


var secretsFunction = function () {
    var pinCode = [1,2,3,3]
    // console.log('pin code inside function: ', pinCode, 'user:', userName);
}

secretsFunction();

// console.log(pinCode, userName);

// var filterNamesByFirstLetter = function (names, letter) {
//     var filteredNames = [];
//     for (let name of names) {
//         if (name[0] === letter) {
//             filteredNames.push(name);
//         }
//     }
//     console.log('name is now: ', name)
//     return filteredNames
// }

// var students = ['Alan', 'Ben', 'Chris', 'David'];
// var filteredStudents = filterNamesByFirstLetter(students, 'C');
// console.log(filteredStudents)

let isItFive = function (number) {
    let result;
    
    if (number === 5) {
        result = true;
    } else {
        result = false;
    }
    return result;
}