package database.connectivity.linux.demo.linux.database.connectivity.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import database.connectivity.linux.demo.linux.database.connectivity.demo.Model.Student;
import database.connectivity.linux.demo.linux.database.connectivity.demo.Repository.StudentJpaRepository;

@RestController
public class StudentController {
    
    @Autowired
    private StudentJpaRepository repository;

    @RequestMapping(method = RequestMethod.GET, path = "/students")
    public List<Student> getAllStudent() {
        return repository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, path = "/students")
    public ResponseEntity<Void> saveStudent(@RequestBody Student newStudent) {
        repository.save(newStudent);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/students/{studentId}")
    public Student getStudentById(@PathVariable int studentId) {
        Optional<Student> current_student = repository.findById(studentId);
        return current_student.get();
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/students/{studentId}")
    public ResponseEntity<Void> deleteStudentById(@PathVariable int studentId) {
        if (repository.existsById(studentId)) {
            repository.deleteById(studentId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    } 
}
