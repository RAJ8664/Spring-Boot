package com.roy.raj.Spring.Security.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.roy.raj.Spring.Security.Model.Student;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class Studentcontroller {
    
    private List<Student> students = new ArrayList<>(List.of(
        new Student(1, "RAJ", "Computer Science"),
        new Student(2 , "UNKNOWN", "Computer Science")
    ));

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudent() {
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @PostMapping("/students")
    public ResponseEntity<List<Student>> addStudent(@RequestBody Student newStudent) {
        students.add(new Student(newStudent.getStudentId(), newStudent.getStudentName(), newStudent.getStudentMajor()));
        return new ResponseEntity<>(students, HttpStatus.CREATED);
    }

    /* CSRF --> Cross-Site Request Forgery */
    @GetMapping("/csrf-token")
    public ResponseEntity<CsrfToken> getTokenId(HttpServletRequest request) {
        System.out.println(request.getAttribute("_csrf"));
        return new ResponseEntity<>((CsrfToken) request.getAttribute("_csrf"), HttpStatus.OK);
    }
}
