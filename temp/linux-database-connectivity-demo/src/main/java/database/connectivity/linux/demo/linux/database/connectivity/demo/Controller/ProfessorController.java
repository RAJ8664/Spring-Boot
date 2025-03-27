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

    //Get all the Professors;
    @RequestMapping(method = RequestMethod.GET, path = "/professors")
    public ResponseEntity<?> getAllProfessors() {
        List<Professor> professors = repository.findAll();
        if (!professors.isEmpty()) {
            return new ResponseEntity<>(professors, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);     
    }

    //Add a Professor;
    @RequestMapping(method = RequestMethod.POST, path = "/professor")
    public ResponseEntity<?> saveProfessor(@RequestBody Professor new_Professor) {
        repository.save(new_Professor);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    //Fetch a Professor using ProfessorId;
    @RequestMapping(method = RequestMethod.GET, path = "/professor/{professorID}")
    public ResponseEntity<?> getProfessorById(@PathVariable int professorID) {
        if (repository.existsById(professorID)) {
            return new ResponseEntity<>(repository.findById(professorID), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    //Delete a Professor with professorId;
    @RequestMapping(method = RequestMethod.DELETE, path = "/professor/{professorId}")
    public ResponseEntity<?> deleteProfessorById(@PathVariable int professorId) {
        if (repository.existsById(professorId)) {
            repository.deleteById(professorId);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    //Update ProfessorName with ProfessorId;
    @RequestMapping(method = RequestMethod.PUT, path = "/professor/{professorID}/name/{professorName}")
    public ResponseEntity<?> updateProfessorNameById(@PathVariable int professorID, @PathVariable String professorName) {
        if (repository.existsById(professorID)) {
            Professor current_professor = repository.findById(professorID).get();
            repository.deleteById(professorID);
            current_professor.setProfessorName(professorName);
            repository.save(current_professor);
            return new ResponseEntity<>(current_professor, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    //Update ProfessorDepartment with ProfessorId;
    @RequestMapping(method = RequestMethod.PUT, path = "/professor/{professorId}/dept/{professorDept}")
    public ResponseEntity<?> updateProfessorDepartmentById(@PathVariable int professorId, @PathVariable String professorDept) {
        if (repository.existsById(professorId)) {
            Professor current_professor = repository.findById(professorId).get();
            repository.deleteById(professorId);
            current_professor.setProfessorDept(professorDept);
            repository.save(current_professor);
            return new ResponseEntity<>(current_professor, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    //Update ProfessorEmail with ProfessorId;
    @RequestMapping(method = RequestMethod.PUT, path = "/professor/{professorId}/email/{professorEmail}")
    public ResponseEntity<?> updateProfessorEmailById(@PathVariable int professorId, @PathVariable String professorEmail) {
        if (repository.existsById(professorId)) {
            Professor current_professor = repository.findById(professorId).get();
            repository.deleteById(professorId);
            current_professor.setProfessorEmail(professorEmail);
            repository.save(current_professor);
            return new ResponseEntity<>(current_professor, HttpStatus.OK);
        }   
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
