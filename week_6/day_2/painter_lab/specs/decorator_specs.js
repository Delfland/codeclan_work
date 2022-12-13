const assert = require('assert');
const Decorator = require('../decorator.js');
const Paint = require('../paint.js');
const Room = require('../room.js');

describe('Decorator', function(){
    let decorator;
    this.beforeEach(function(){
        decorator = new Decorator('Jack');
    })
    
describe('paint stock', function(){
    it('should start with no stock', function(){
        const actual = decorator.stock;
        assert.deepStrictEqual(actual, []);
    })
    it('should be return the number of paint pots', function(){
        const actual = decorator.numberOfPaintPots();
        assert.deepStrictEqual(actual, 0);
    })
    it('should add a paint pot', function(){
        let paint1 = new Paint(20);
        decorator.addPaint(paint1);
        const actual = decorator.numberOfPaintPots();
        assert.deepStrictEqual(actual, 1);
    })
    it('should add up litres in stock', function(){
        let paint1 = new Paint(20);
        decorator.addPaint(paint1);
        let paint2 = new Paint(15);
        decorator.addPaint(paint2);
        const actual = decorator.totalLitres();  
        assert.deepStrictEqual(actual, 35);
    })
    it('should calculate if enough to paint a room', function(){
        let paint1 = new Paint(20);
        decorator.addPaint(paint1);
        let paint2 = new Paint(15);
        decorator.addPaint(paint2);
        let room1 = new Room(30);
        const actual = decorator.enoughPaint(room1);  
        assert.deepStrictEqual(actual, true);
    })
    // it('should paint room if enough paint in stock', function(){
    //     let paint1 = new Paint(20);
    //     decorator.addPaint(paint1);
    //     let paint2 = new Paint(15);
    //     decorator.addPaint(paint2);
    //     let room1 = new Room(30);
    //     room1.paintRoom()
    //     const actual = room1.painted;  
    //     assert.deepStrictEqual(actual, true);
    // })
})
});
