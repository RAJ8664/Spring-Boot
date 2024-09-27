package database.connectivity.linux.demo.linux.database.connectivity.demo.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import database.connectivity.linux.demo.linux.database.connectivity.demo.Model.Professor;
import database.connectivity.linux.demo.linux.database.connectivity.demo.Repository.ProfessorJpaRepository;

@RestController
public class ProfessorController {
    
    @Autowired
    private ProfessorJpaRepository repository;

    @RequestMapping(method = RequestMethod.PUT, path = "/professor")
    public ResponseEntity<?> getAllProfessors() {
        List<Professor> professors = repository.findAll();
        if (professors.size() > 0) {
            return new ResponseEntity<>(professors, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    @RequestMapping(method = RequestMethod.POST, path = "/professor")
    public ResponseEntity<?> saveProfessor(@RequestBody Professor new_Professor) {
        repository.save(new_Professor);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/professor/{professorID}")
    public ResponseEntity<?> getProfessorById(@PathVariable int professorID) {
        if (repository.existsById(professorID)) {
            return new ResponseEntity<>(repository.findById(professorID) , HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
