const names = ["Fred", "Kate", "Cindy", "Ricky", "Keith"];
console.log(names);

const fred = names[0];
const kate = names[1];
console.log(kate);

const [alice, kathy] = names;
console.log(kathy);

const [ , , , ricky] = names;
console.log(ricky);

const [fred1, kate1, ...remainingNames] = names
console.log(remainingNames);