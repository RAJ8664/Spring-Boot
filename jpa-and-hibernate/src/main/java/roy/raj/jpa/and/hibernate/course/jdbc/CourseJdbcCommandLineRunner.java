package roy.raj.jpa.and.hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import roy.raj.jpa.and.hibernate.course.Course;


@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{

	@Autowired
	public CourseJdbcRepository runner;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		runner.insert(new Course(1, "DSA" , "RAJ" , 2500));
		runner.insert(new Course(2, "web" , "UNKNOWN" , 250000));
		//runner.deleteById(2);
		//System.out.println(runner.FindById(1L));
	}
	
}
