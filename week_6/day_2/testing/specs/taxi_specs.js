const assert = require('assert');
const Taxi = require('../taxi.js');

describe('Taxi', function(){
    let taxi;
    this.beforeEach(function(){
        taxi = new Taxi('Toyota', 'Prius', 'Jane');
    })

    it('should have a manufacturer', function(){
        const actual = taxi.manufacturer;
        assert.strictEqual(actual, 'Toyota');
    });
    it('should have a modesl', function(){
        const actual = taxi.model;
        assert.strictEqual(actual, 'Prius');
    });
    it('should have a driver', function(){
        const actual = taxi.driver;
        assert.strictEqual(actual, 'Jane');
    });
    describe('passengers', function(){
        it('should start with no passengers', function(){
            const actual = taxi.passengers;
            assert.deepStrictEqual(actual, []);
        })
        it('should return the number of passengers', function(){
            const actual = taxi.numberOfPassengers();
            assert.strictEqual(actual, 0)
        })
        it('should add a passenger', function(){
            taxi.addPassenger('Mike');
            const actual = taxi.numberOfPassengers();
            assert.strictEqual(actual, 1)
        })
        it('should be able to remove a passenger by name', function(){
            taxi.addPassenger('Mike');
            taxi.addPassenger('Deirdre');
            taxi.removePassengerByName('Mike');
            const actual = taxi.numberOfPassengers();
            assert.strictEqual(actual, 1)
        })
        it('should be able to remove all passengers', function(){
            taxi.addPassenger('Mike');
            taxi.addPassenger('Deirdre');
            taxi.removePassengers();
            const actual = taxi.numberOfPassengers();
            assert.strictEqual(actual, 0)
        })
    });
    
});

// numberOfPassengers
// addPassenger
// removePassengerByName
// removeAllPassengers