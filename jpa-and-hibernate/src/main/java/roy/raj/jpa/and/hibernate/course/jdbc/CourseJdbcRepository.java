package roy.raj.jpa.and.hibernate.course.jdbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//repository --> something that talks to a database;
@Repository
public class CourseJdbcRepository {
	
	
	@Autowired
	public JdbcTemplate springJdbcTemplate;

	public static String INSERT_QUERY = 
			"""	
				insert into course(id, name , author, price)
				values(1, 'dsa', 'raj' , 150000);
			""";
	
	
	
	public void insert() {
		springJdbcTemplate.update(INSERT_QUERY);
	}
	
	
}
