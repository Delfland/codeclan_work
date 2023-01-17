const express = require('express');
const ObjectID = require('mongodb').ObjectID

const createRouter = function (collection) {

  const router = express.Router();

  // Handle index route
  router.get('/', (req, res) => {
    collection
      .find()
      .toArray()
      .then(result => res.json(result))
      .catch(error => {
        console.error(error);
        res.status(500);
        res.json({ status: 500, error: error});
      });
  });

  // Handle show route
  router.get('/:id', (req, res) => {
    const id = req.params.id;
    collection
      .findOne({_id: ObjectID(id)})
      .then(result => res.json(result))
      .catch(error => {
        console.error(error);
        res.status(500);
        res.json({ status: 500, error: error});
      });
  });

  // Handle create route
  router.post('/', (req, res) => {
    const newData = req.body;
    collection
      .insertOne(newData)
      .then(result => {
        res.json(result.ops[0])
      })
      .catch(error => {
        console.error(error);
        res.status(500);
        res.json({ status: 500, error: error});
      });
  });

  // Handle delete route

  router.delete('/:id', (req, res) => {
    const id = req.params.id;
    collection
      .deleteOne({_id: ObjectID(id)})
      .then(result => res.json(result))
      .catch(error => {
        console.error(error);
        res.status(500);
        res.json({ status: 500, error: error});
      });
  });


  // Handle update route

  router.put('/:id', (req, res) => {
    const id = req.params.id;
    updatedData = req.body;
    collection
      .updateOne({_id : ObjectID(id)},
      {$set: updatedData}
      )
      .then(result => res.json(result))
      .catch(error => {
        console.error(error);
        res.status(500);
        res.json({ status: 500, error: error});
      });
  });


  return router;

};

module.exports = createRouter;
