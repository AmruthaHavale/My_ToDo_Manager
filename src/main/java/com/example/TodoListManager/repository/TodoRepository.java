package com.example.TodoListManager.repository;

import com.example.TodoListManager.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Integer> {
}
