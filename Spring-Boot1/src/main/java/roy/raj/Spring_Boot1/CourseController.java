package roy.raj.Spring_Boot1;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> RetrieveCoourse() {
        List<Course> res = new ArrayList<>();
        Course course1 = new Course(1 , "DSA" , 2500);
        Course course2 = new Course(2,  "WEB" , 25000);
        res.add(course1); res.add(course2);
        return res;
    }

    @RequestMapping("/students")
    public ArrayList<Students> RetrieveStudents() {
        ArrayList<Students> res = new ArrayList<>();
        Students std1 = new Students(1, "MAC" , new Course(1, "DSA" , 2500));
        Students std2 = new Students(2 , "UNKNOWN" , new Course(2, "WEB" , 25000));
        res.add(std1); res.add(std2);
        return res;
    }
}
