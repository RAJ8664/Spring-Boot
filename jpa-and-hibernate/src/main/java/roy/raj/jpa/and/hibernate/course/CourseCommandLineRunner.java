package roy.raj.jpa.and.hibernate.course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import roy.raj.jpa.and.hibernate.course.JPA.CourseJPARepository;



@Component
public class CourseCommandLineRunner implements CommandLineRunner{

	@Autowired
	public CourseJPARepository jpaRunner;
	
	@Override
	public void run(String... args) throws Exception {
		jpaRunner.insert(new Course(1, "DSA" , "RAJ" , 500));
		jpaRunner.insert(new Course(2, "WEB" , "UNKNOWN" , 5000));

		jpaRunner.deleteById(1);

		System.out.println(jpaRunner.FindById(2));
	}
	
}
