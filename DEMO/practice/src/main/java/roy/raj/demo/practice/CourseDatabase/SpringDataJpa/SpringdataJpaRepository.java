package roy.raj.demo.practice.CourseDatabase.SpringDataJpa;

import org.springframework.data.jpa.repository.JpaRepository;
import roy.raj.demo.practice.CourseDatabase.course;

public interface SpringdataJpaRepository extends JpaRepository<course, Integer> {
    
}
