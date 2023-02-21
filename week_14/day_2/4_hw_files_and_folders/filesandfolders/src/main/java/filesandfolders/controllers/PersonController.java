package filesandfolders.controllers;

import filesandfolders.models.Person;
import filesandfolders.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @PostMapping(value = "/persons")
    public ResponseEntity<Person> createPerson(@RequestBody Person person){
        personRepository.save(person);
        return new ResponseEntity<>(person, HttpStatus.CREATED);
    }

    @GetMapping(value= "/persons")
    public ResponseEntity<List<Person>> getAllPersons(){
        return new ResponseEntity<>(personRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/persons/{id}")
    public ResponseEntity getPerson(@PathVariable Long id){
        return new ResponseEntity(personRepository.findById(id), HttpStatus.OK);
    }
}
