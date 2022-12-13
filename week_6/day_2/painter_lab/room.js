const Decorator = require("./decorator");

const Room = function(area, painted){
    this.area = area;
    this.painted = false;
}

Room.prototype.paintRoom = function(){
        return this.painted = true;
}

module.exports = Room;