package roy.raj.jpa.and.hibernate.course.jdbc;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import roy.raj.jpa.and.hibernate.course.Course;

//repository --> something that talks to a database;
@Repository
public class CourseJdbcRepository {
	
	@Autowired
	public JdbcTemplate springJdbcTemplate;


	//solution to not write these queries -- > JPA
	public static String INSERT_QUERY = 
			"""	
				insert into course(id, name , author, price)
				values(? , ? , ? , ?);
			""";
	
	public static String DELETE_QUERY = 
			"""
				delete from course
				where id = ?;
			""";
	
	public static String SELECT_QUERY = 
			"""
				select * from course 
				where id = ?;
			""";
	

	public void insert(Course course) { 
		springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor(), course.getPrice());
	}
	
	public void deleteById(long id) {
		springJdbcTemplate.update(DELETE_QUERY, id);
	}
	
	public Course FindById(long id) {
		return springJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
	}
		
}
