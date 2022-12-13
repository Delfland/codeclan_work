const Pet = require('./pet.js');
const Person = require('./person.js');

const scooby = new Pet('Scooby Doo', 'Dog');
scooby.eat('Scooby snack');

const shaggy = new Person('Shaggy Rogers');
shaggy.greet();