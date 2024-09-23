package roy.raj.demo.practice;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/course")
    public ArrayList<Course> PrintCourses() {
        ArrayList<Course> res = new ArrayList<>();
        Course course1 = new Course("DSA" , 500, "RAJ");
        Course course2 = new Course("WEB" , 100, "UNKOWN");
        res.add(course1); res.add(course2);
        return res;
    }
}
