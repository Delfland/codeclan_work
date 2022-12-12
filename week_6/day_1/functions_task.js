function addArray(array) {
    var total = 0;
    for (var singleNumber of array) {
        total += singleNumber;        
} return(total);
}
var numbers = [10, 20, 30]
console.log(addArray(numbers))


var checkForString = function (string, object) {
    for (var key in object) {
        if (key === string) {
            return true;

        }
    }
    return false
}
var person = {
    name: 'Delph',
    colour: 'green' 
};

var key = 'colour';
var wasPresent = checkForString(key, person);
console.log(wasPresent);