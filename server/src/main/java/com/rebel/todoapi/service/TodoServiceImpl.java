package com.rebel.todoapi.service;

import com.rebel.todoapi.model.Todo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface TodoServiceImpl {
    List<Todo> getAllTodo();
    Map createTodo(Todo request);
    Map updateMarkTodo(Todo request, Long id);
    Map updateValueTodo(Todo request, Long id);
    Map deleteTodo(Long id);
}
