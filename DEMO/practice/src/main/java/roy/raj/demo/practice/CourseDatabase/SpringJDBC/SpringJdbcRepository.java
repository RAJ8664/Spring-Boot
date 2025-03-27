package roy.raj.demo.practice.CourseDatabase.SpringJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import roy.raj.demo.practice.CourseDatabase.Employee;
import roy.raj.demo.practice.CourseDatabase.course;


@Repository
public class SpringJdbcRepository {
    
    @Autowired
    private JdbcTemplate template;

    private static String INSERT_QUERY = 
            """
                insert into course values (? , ? , ?);
            """;
    
            // """ 
            //     insert into course values (1, 'WEB' , 5000);
            // """;

    private static String INSERT_QUERY1 = 
            """
                insert into Employee values (? , ? , ?);        
            """;

            // """
            //     insert into Employee values (1, 'UNKOWN' , 10000);
            // """;

    private String DELETE_QUERY = 
            """
                delete from course where id = ?;        
            """;
            
            // """
            //     delete from course where id = 1; 
            // """;

    private String DELETE_QUERY1 = 
            """
                delete from Employee where Employee_Id = ?;        
            """;
            
            // """
            //     delete from Employee where Employee_Id = 1;
            // """;


    public void insert(course course1) {
        template.update(INSERT_QUERY , course1.getId(), course1.getName(), course1.getcost());
    }

    public void Employee_Insert(Employee employee) {
        template.update(INSERT_QUERY1, employee.getEmployeeId() , employee.getEmployeeName(), employee.getEmployeeIncome());
    }

    // public void insert() {
    //     template.update(INSERT_QUERY);
    // }

    // public void insert1() {
    //     template.update(INSERT_QUERY1);
    // }

    // public void delete() {
    //     template.update(DELETE_QUERY);
    // }

    // public void delete1() {
    //     template.update(DELETE_QUERY1);
    // }

}
