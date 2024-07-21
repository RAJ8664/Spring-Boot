package com.roy.raj.TODO.WEB.APP.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;


@Controller
public class TodoController {

    @Autowired
    private TodoService todoService;

    @RequestMapping("list-todos")
    public String listTodos(ModelMap map) {
        ArrayList<Todo> res = todoService.getTodosByUsername("raj");
        map.addAttribute("todos", res);
        return "listTodos";
    }

}
