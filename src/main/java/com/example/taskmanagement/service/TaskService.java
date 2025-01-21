package com.example.taskmanagement.service;

import com.example.taskmanagement.model.Task;
import java.util.List;

public interface TaskService {
    // Get all tasks
    List<Task> getAllTasks();
    
    // Get task by ID
    Task getTaskById(Long id);
    
    // Create new task
    Task createTask(Task task);
    
    // Update existing task
    Task updateTask(Long id, Task task);
    
    // Delete task
    void deleteTask(Long id);
}
