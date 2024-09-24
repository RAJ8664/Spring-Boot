package roy.raj.demo.practice.CourseDatabase;

import org.aspectj.lang.annotation.Around;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import roy.raj.demo.practice.CourseDatabase.SpringDataJpa.SpringDataJpaRepository;
import roy.raj.demo.practice.CourseDatabase.SpringDataJpa.SpringDataJpaRepositoryS;
import roy.raj.demo.practice.CourseDatabase.SpringDataJpa.SpringdataJpaRepository;
import roy.raj.demo.practice.CourseDatabase.SpringJDBC.SpringJdbcRepository;

@Component
public class SpringJdbcCommandLineRunner implements CommandLineRunner{

    @Autowired
    private SpringJdbcRepository Jdbcrepository;

    @Autowired
    private SpringdataJpaRepository repository;

    @Autowired
    private SpringDataJpaRepository employee_repository;

    @Autowired
    private SpringDataJpaRepositoryS student_repo;

    @Override
    public void run(String... args) throws Exception {

        /*Insert Queries*/
        //course course1 = new course(1, 'sa' , 500);
        // repository.insert(new course(1, "web" , 500));
        // repository.insert(new course(2, "dsa" , 1000));

        // repository.Employee_Insert(new Employee(1, "UNKNOWN" , 100000));

        //repository.insert1();

        // /*Delete Queries*/
        // repository.delete();
        // repository.delete1();
    
        repository.save(new course(1, "DSA" , 10000));
        repository.save(new course(2, "web" , 20000));
        repository.save(new course(3, "blockchain" , 1000000));


        employee_repository.save(new Employee(1l, "RAJ" , 1000l));
        employee_repository.save(new Employee(2l, "UNKNOWN" , 2000l));
        employee_repository.save(new Employee(3l, "HIDDEN" , 400l));

        student_repo.save(new Student(1, "RAJ ROY" , "Computer Science"));
        student_repo.save(new Student(2, "UNKOWN" , "Computer Science"));
        student_repo.save(new Student(3, "HIDDEN" , "Electronics"));
    
    }
}
