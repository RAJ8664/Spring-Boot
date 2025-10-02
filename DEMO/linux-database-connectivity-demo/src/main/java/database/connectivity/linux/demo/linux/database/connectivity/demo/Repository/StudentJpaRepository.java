package database.connectivity.linux.demo.linux.database.connectivity.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import database.connectivity.linux.demo.linux.database.connectivity.demo.Model.Student;

@Repository
public interface StudentJpaRepository extends JpaRepository<Student, Integer> {

}
