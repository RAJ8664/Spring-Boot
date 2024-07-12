package roy.raj.jpa.and.hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{

	@Autowired
	public CourseJdbcRepository runner;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		runner.insert();
		
	}
	
}
