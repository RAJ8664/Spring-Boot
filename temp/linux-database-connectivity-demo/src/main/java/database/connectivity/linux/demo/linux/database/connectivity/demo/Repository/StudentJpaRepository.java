package database.connectivity.linux.demo.linux.database.connectivity.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import database.connectivity.linux.demo.linux.database.connectivity.demo.Model.Student;

public interface StudentJpaRepository extends JpaRepository<Student, Integer>{
    
}
