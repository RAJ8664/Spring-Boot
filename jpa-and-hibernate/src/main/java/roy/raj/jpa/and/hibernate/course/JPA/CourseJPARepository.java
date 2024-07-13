package roy.raj.jpa.and.hibernate.course.JPA;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import roy.raj.jpa.and.hibernate.course.Course;

//Repository -- > something that talks to a database;
@Repository
@Transactional
public class CourseJPARepository {

    //autowired would also work fine;
    @PersistenceContext
    public EntityManager entityManager;

    public void insert(Course course) {
        entityManager.merge(course);
    }

    public Course FindById(long id) {
        return entityManager.find(Course.class, id);
    }

    public void deleteById(long id) {
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }


}
