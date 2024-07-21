package com.roy.raj.TODO.WEB.APP.todo;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class TodoService {
    private static ArrayList<Todo> todos = new ArrayList<>();
    static {
        todos.add(new Todo(1, "Learn DSA" , LocalDate.now().plusYears(1), false));
        todos.add(new Todo(2, "Learn WEB Development", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(3, "Learn AWS Development", LocalDate.now().plusYears(3), false));
    }

    public ArrayList<Todo> getTodosByUsername(String name) {
        return todos;
    }
}
