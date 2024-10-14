package roy.raj.com.todo_web_application.Controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import roy.raj.com.todo_web_application.Model.Todo;
import roy.raj.com.todo_web_application.Repository.TodoJpaRepository;


@RestController
public class TodoController {
	
	@Autowired
	TodoJpaRepository repository;

	@RequestMapping(method = RequestMethod.GET, path = "/users/{Id}/todos")
	public ResponseEntity<?> getTodosById(@PathVariable int Id) {
		List<Todo> res = repository.findAllById(Id);
		if (res.size() == 0) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(res, HttpStatus.OK);
	} 


}
