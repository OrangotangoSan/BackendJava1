package com.example.todo.todo1.controller;

import com.example.todo.todo1.model.Tarefas;
import com.example.todo.todo1.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;


    @GetMapping
    public List<Tarefas> todoList(){
        return todoRepository.findAll();
    }

    @PostMapping
    public Tarefas addTodo(@RequestBody Tarefas todo){
        return todoRepository.save(todo);
    }
}
