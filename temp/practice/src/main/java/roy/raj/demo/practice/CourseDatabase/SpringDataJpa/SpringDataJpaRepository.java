package roy.raj.demo.practice.CourseDatabase.SpringDataJpa;

import org.springframework.data.jpa.repository.JpaRepository;
import roy.raj.demo.practice.CourseDatabase.Employee;

public interface SpringDataJpaRepository extends JpaRepository<Employee, Long>{
    
}
