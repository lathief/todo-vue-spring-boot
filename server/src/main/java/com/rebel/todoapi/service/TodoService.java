package com.rebel.todoapi.service;

import com.rebel.todoapi.model.Todo;
import com.rebel.todoapi.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TodoService implements TodoServiceImpl{
    @Autowired
    TodoRepository todoRepository;
    public List<Todo> getAllTodo() {
        return todoRepository.findAll();
    }

    public Map createTodo(Todo request) {
        Map<String, Object> map = new HashMap<>();
        map.put("todo", todoRepository.save(request));
        map.put("status", "success");
        return map;
    }

    public Map updateMarkTodo(Todo request, Long id) {
        Map<String, Object> map = new HashMap<>();
        if (todoRepository.existsById(id)){
            todoRepository.updateMark(id, request.getCompleted());
            map.put("todo", request);
            map.put("status", "Success");
        } else {
            map.put("todo", "Todo doesn't exist");
            map.put("status", "Failed");
        }
        return map;
    }
    public Map updateValueTodo(Todo request, Long id) {
        Map<String, Object> map = new HashMap<>();
        if (todoRepository.existsById(id)){
            todoRepository.updateValue(id, request.getValue());
            map.put("todo", request);
            map.put("status", "Success");
        } else {
            map.put("todo", "Todo doesn't exist");
            map.put("status", "Failed");
        }
        return map;
    }

    public Map deleteTodo(Long id) {
        Map<String, Object> map = new HashMap<>();
        if (todoRepository.existsById(id)){
            todoRepository.deleteById(id);
            map.put("todo", "Todo has been deleted");
            map.put("status", "Success");
        } else {
            map.put("todo", "Todo doesn't exist");
            map.put("status", "Failed");
        }
        return map;
    }

}
