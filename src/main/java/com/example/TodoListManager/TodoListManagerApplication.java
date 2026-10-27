package com.example.TodoListManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TodoListManagerApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context =
				SpringApplication.run(TodoListManagerApplication.class, args);

//		SpringApplication.run(TodoListManagerApplication.class, args);
//
//		Todo todo = new Todo();
//		TodoRepository repo = context.getBean(TodoRepository.class);
//
//		todo.setTask("Second Task");
//		todo.setCompleted(true);
//
//		System.out.println("ID: "+todo.getId()+"\nTask: "+todo.getTask()+"\nCompleted: "+todo.getTask());
//
//		repo.save(todo);
	}

}
