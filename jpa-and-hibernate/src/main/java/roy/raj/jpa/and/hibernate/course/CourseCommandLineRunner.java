package roy.raj.jpa.and.hibernate.course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import roy.raj.jpa.and.hibernate.course.JPA.CourseJPARepository;
import roy.raj.jpa.and.hibernate.course.springdatajpa.springdatajpaRepository;


@Component
public class CourseCommandLineRunner implements CommandLineRunner{

//	@Autowired
//	public CourseJPARepository jpaRunner;

	@Autowired
	private springdatajpaRepository runner;
	
	@Override
	public void run(String... args) throws Exception {
//		jpaRunner.insert(new Course(1, "DSA" , "RAJ" , 500));
//		jpaRunner.insert(new Course(2, "WEB" , "UNKNOWN" , 5000));
//		jpaRunner.deleteById(1);
//		System.out.println(jpaRunner.FindById(2));

		runner.save(new Course(1, "dsa" , "raj" , 600));
		runner.save(new Course(2, "web" , "unknown" , 2500));
		runner.save(new Course(3, "cloud" , "hidden" , 1000));
		runner.save(new Course(4, "java" , "hidden" , 500));


		runner.deleteById(1L);
		System.out.println(runner.findById(2L));
		System.out.println(runner.findById(3L));
		System.out.println(runner.findById(4L));
		System.out.println(runner.existsById(1L));
		System.out.println(runner.count());
		System.out.println(runner.findAll());
		System.out.println(runner.findByAuthor("hidden"));
		System.out.println();

	}
	
}
