package com.example.TodoListManager.service;

import com.example.TodoListManager.entity.Todo;
import com.example.TodoListManager.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repo;

    public List<Todo> showAllTask() {
        return repo.findAll();
    }

    public Todo addTask(Todo task){

        System.out.println(task.getTask());
        return repo.save(task);
    }

    public Todo getTaskById(int id){
        return repo.findById(id).orElse(null);
    }

    public void toggleTask(int id){

        Todo todo = repo.findById(id).orElse(null);

        if(todo != null){
            todo.setCompleted(!todo.isCompleted());

            repo.save(todo);
        }
    }

    public void deleteTask(int id){
        repo.deleteById(id);
    }
}
