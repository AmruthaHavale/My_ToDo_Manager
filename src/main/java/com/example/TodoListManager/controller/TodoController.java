package com.example.TodoListManager.controller;

import com.example.TodoListManager.entity.Todo;
import com.example.TodoListManager.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TodoController {

    @Autowired
    private TodoService service;

    @GetMapping("/")
    public String home(Model model){

        model.addAttribute("todo", new Todo());
        model.addAttribute("tasks", service.showAllTask());

        return "index";
    }

    @PostMapping("/add")
    public String addTask(@ModelAttribute Todo todo){

        service.addTask(todo);

        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editTask(@PathVariable int id, Model model) {

        Todo todo = service.getTaskById(id);

        model.addAttribute("todo", todo);

        return "edittask";
    }

    @PostMapping("/edit")
    public String updateTask(@ModelAttribute Todo todo) {

        service.addTask(todo);

        return "redirect:/";
    }

    @PostMapping("/toggle/{id}")
    public String toggleTask(@PathVariable int id){

        service.toggleTask(id);

        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteTask(@PathVariable int id){

        service.deleteTask(id);

        return "redirect:/";
    }

}
