const Taxi = function(manufacturer, model, driver){
    this.manufacturer = manufacturer;
    this.model = model;
    this.driver = driver;
    this.passengers = [];
}

Taxi.prototype.numberOfPassengers = function(){
    return this.passengers.length;
}

Taxi.prototype.addPassenger = function(passenger){
    this.passengers.push(passenger)
}

Taxi.prototype.removePassengerByName = function(name){
    const indexOfPassenger = this.passengers.indexOf(name);

}

Taxi.prototype.removePassengers = function(){
    this.passengers.splice(0, this.numberOfPassengers());
}

module.exports = Taxi;