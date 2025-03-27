package roy.raj.demo.practice.RESTAPI.HelloWorld;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    

    @RequestMapping(method = RequestMethod.GET , path = "/hello")
    public String Hello() {
        return "hello world !";
    }
    

    @RequestMapping(method = RequestMethod.GET , path = "/hello/wish/{name}/{id}")
    public String wish(@PathVariable String name, @PathVariable int id) {
        String res = "Hello ";
        res = res + name + " your id is " + id;
        return res;
    }
    

}
