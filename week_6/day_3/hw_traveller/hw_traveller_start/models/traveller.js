const Traveller = function(journeys) {
  this.journeys = journeys;
};

Traveller.prototype.getJourneyStartLocations = function() {
  return this.journeys.map((journey) => journey.startLocation);
};

Traveller.prototype.getJourneyEndLocations = function () {
  return this.journeys.map((journey) => journey.endLocation);
};

Traveller.prototype.getJourneysByTransport = function (transport) {
  const journeyByTransport = this.journeys.filter((journey) => {
    return journey.transport === transport;
  });
  return journeyByTransport;
};

Traveller.prototype.getJourneysByMinDistance = function (minDistance) {
  return this.journeys.filter((journey) => {
    return journey.distance >= minDistance;
  });
};

Traveller.prototype.calculateTotalDistanceTravelled = function () {
 return this.journeys.reduce((total, journey) => {
  return total += journey.distance;
 }, 0);
};

Traveller.prototype.getUniqueModesOfTransport = function () {
const uniqueTransports = this.journeys
.map((journey) => journey.transport)
.filter((transport, index, self) => self.indexOf(transport) === index);
return uniqueTransports
};


module.exports = Traveller;
