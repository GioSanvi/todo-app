package com.gio.todo.controller;

import com.gio.todo.entity.Todo;
import com.gio.todo.service.TodoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/todos")
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    public Todo addTodo(@RequestBody Todo todo) {
       return todoService.addNewTodo(todo);
    }
}
