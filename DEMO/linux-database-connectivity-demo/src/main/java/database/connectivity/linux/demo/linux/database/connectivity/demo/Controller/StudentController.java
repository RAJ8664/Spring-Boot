package database.connectivity.linux.demo.linux.database.connectivity.demo.Controller;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    /* Get all the Students */
    @RequestMapping(method = RequestMethod.GET, path = "/students")
    public ResponseEntity<?> getAllStudent() {
        List<Student> allStudents = repository.findAll();
        if (!allStudents.isEmpty()) {
            return new ResponseEntity<>(allStudents, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    /* Add a Student */
    @RequestMapping(method = RequestMethod.POST, path = "/student")
    public ResponseEntity<?> saveStudent(@RequestBody Student newStudent) {
        repository.save(newStudent);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    /* Fetch a Student with StudentId */
    @RequestMapping(method = RequestMethod.GET, path = "/student/{studentId}")
    public ResponseEntity<?> getStudentById(@PathVariable int studentId) {
        Optional<Student> current_student = repository.findById(studentId);
        if (current_student.isPresent()) {
            return new ResponseEntity<>(current_student.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    /* Get all the students based on studentName */
    @RequestMapping(method = RequestMethod.PUT, path = "/student/all/{studentName}")
    public ResponseEntity<?> getListOfStudentsByName(@PathVariable String studentName) {
        List<Student> list_of_students = new ArrayList<>();
        list_of_students = repository.findAll();
        List<Student> result_students = new ArrayList<>();
        for (Student current_student : list_of_students) {
            if (current_student.getStudentName().equals(studentName))
                result_students.add(current_student);
        }
        return new ResponseEntity<>(result_students, HttpStatus.OK);
    }

    /* Delete a Student with StudentId */
    @RequestMapping(method = RequestMethod.DELETE, path = "/student/{studentId}")
    public ResponseEntity<?> deleteStudentById(@PathVariable int studentId) {
        if (repository.existsById(studentId)) {
            repository.deleteById(studentId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    /* Update StudentBranch with StudentId */
    @RequestMapping(method = RequestMethod.PUT, path = "/student/{studentID}/branch/{studentBranch}")
    public ResponseEntity<?> updateBranchById(@PathVariable int studentID, @PathVariable String studentBranch) {
        if (repository.existsById(studentID)) {
            Student current_student = repository.findById(studentID).get();
            current_student.setStudentBranch(studentBranch);
            repository.deleteById(studentID);
            repository.save(current_student);
            return new ResponseEntity<>(current_student, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    /* Update StudentName with StudentId */
    @RequestMapping(method = RequestMethod.PUT, path = "/student/{studentID}/name/{studentName}")
    public ResponseEntity<?> updateNameById(@PathVariable int studentID, @PathVariable String studentName) {
        if (repository.existsById(studentID)) {
            Student current_student = repository.findById(studentID).get();
            repository.deleteById(studentID);
            current_student.setStudentName(studentName);
            repository.save(current_student);
            return new ResponseEntity<>(current_student, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
