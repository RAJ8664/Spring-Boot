package roy.raj.com.todo_web_application.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class HelloWorldControler {

	@RequestMapping(method = RequestMethod.GET, path = "/hello-world/name/{name}")
	public String hello(@PathVariable String name) {
		return "hello " + name;
	}
}
