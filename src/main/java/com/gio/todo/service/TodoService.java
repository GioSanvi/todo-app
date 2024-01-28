package com.gio.todo.service;

import com.gio.todo.entity.Todo;
import com.gio.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    private final TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    public void addNewTodo(Todo todo){
        todoRepository.save(todo);

    }
}
