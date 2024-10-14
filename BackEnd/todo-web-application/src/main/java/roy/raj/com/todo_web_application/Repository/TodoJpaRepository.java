package roy.raj.com.todo_web_application.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import roy.raj.com.todo_web_application.Model.Todo;

public interface TodoJpaRepository extends JpaRepository<Todo, Integer>{
	List<Todo> findAllById(int Id);
}
