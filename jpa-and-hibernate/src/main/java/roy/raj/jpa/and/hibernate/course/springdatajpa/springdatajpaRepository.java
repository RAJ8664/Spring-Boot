package roy.raj.jpa.and.hibernate.course.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import roy.raj.jpa.and.hibernate.course.Course;

import java.util.List;

public interface springdatajpaRepository extends JpaRepository<Course, Long> {
    //we can define our own custom method here -->

    List<Course> findByAuthor(String author);

}
