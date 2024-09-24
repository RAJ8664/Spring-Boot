package roy.raj.demo.practice.CourseDatabase.SpringDataJpa;

import org.springframework.data.jpa.repository.JpaRepository;
import roy.raj.demo.practice.CourseDatabase.Student;

public interface SpringDataJpaRepositoryS extends JpaRepository<Student, Integer>{
    
}
