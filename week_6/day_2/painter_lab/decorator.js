const Decorator = function(name){
    this.name = name;
    this.stock = [];
}

Decorator.prototype.numberOfPaintPots = function (){
    return this.stock.length;
}

Decorator.prototype.addPaint = function(paint){
    return this.stock.push(paint);
}

Decorator.prototype.totalLitres = function(){
    let result = 0;
    for (let i = 0; i < this.stock.length; i++) {
        result += this.stock[i].litres;
    }
    return result;
}

Decorator.prototype.enoughPaint = function(room){
    let totalPaint = this.totalLitres();
    let totalCoverage = totalPaint * 6
    if (totalCoverage > room.area) {
        return true
    } else {
        return false
    }
}



module.exports = Decorator;

