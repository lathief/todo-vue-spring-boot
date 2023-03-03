package com.rebel.todoapi.controller;

import com.rebel.todoapi.model.Todo;
import com.rebel.todoapi.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class TodoController {
    @Autowired
    TodoService todoService;
    @GetMapping("/index")
    public List<Todo> getAllTodo() {
        return todoService.getAllTodo();
    }
    @PostMapping("/store")
    public ResponseEntity<Map> createTodo(@RequestBody Todo RequestTodo) {
        Map result = todoService.createTodo(RequestTodo);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    @PutMapping("/updatemark/{id}")
    public ResponseEntity<Map> updateMarkTodo(@RequestBody Todo RequestTodo, @PathVariable Long id) {
        Map result = todoService.updateMarkTodo(RequestTodo, id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    @PutMapping("/updatevalue/{id}")
    public ResponseEntity<Map> updateValueTodo(@RequestBody Todo RequestTodo, @PathVariable Long id) {
        Map result = todoService.updateValueTodo(RequestTodo, id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map> deleteTodo(@PathVariable Long id) {
        Map result = todoService.deleteTodo(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
