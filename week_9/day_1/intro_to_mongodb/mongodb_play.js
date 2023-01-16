use zoo;

// Find all

db.animals.find();

// Find by id

const id = ObjectId('63c55a5c5d54643566406d92');
db.animals.findOne({_id : id}) 

// Update entry

db.animals.updateOne(
    {_id: ObjectId('63c55a5c5d54643566406d93')},
    {$set: {name: "Delph"}}
);
db.animals.findOne({_id: ObjectId('63c55a5c5d54643566406d93')});

// Delete entry

db.animals.deleteOne({_id: ObjectId('63c55a5c5d54643566406d93')})