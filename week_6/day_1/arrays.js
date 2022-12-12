var myArray = [];

var sports = ['football', 'tennis', 'rugby'];

console.log(sports);
console.log(sports.length);

console.log(sports[0]);

sports.push('kayak');
sports.push('basketball', 'curling');

console.log(sports);
console.log(sports.length);

var removedSport = sports.pop();
console.log(removedSport);
console.log(sports);

sports.unshift('hockey', 'golf');
console.log(sports);
sports.shift();
console.log(sports);

var removedElement = sports.splice(1, 2);
console.log(removedElement);
console.log(sports);

for (var currentSport of sports) {
    var upperCaseSport = currentSport.toUpperCase();
    console.log(upperCaseSport)
}
// create a variable i, as long as i is smaller than the length of the array sports, increment i by 1
// i += 2 will skip every other item in array
for (var i = 0; i < sports.length; i++) { 
    console.log('counter was: ', i, ' sport was', sports[i]);
}


