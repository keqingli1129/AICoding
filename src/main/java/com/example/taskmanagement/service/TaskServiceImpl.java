package com.example.taskmanagement.service;

import com.example.taskmanagement.exception.TaskNotFoundException;
import com.example.taskmanagement.model.Task;
import com.example.taskmanagement.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    
    @Autowired
    private TaskRepository taskRepository;
    
    @Override
    public List<Task> getAllTasks() {
        // TODO: Implement method to return all tasks
        return null;
    }
    
    @Override
    public Task getTaskById(Long id) {
        // TODO: Implement method to find and return task by ID
        // TODO: Throw TaskNotFoundException if task not found
        return null;
    }
    
    @Override
    public Task createTask(Task task) {
        // TODO: Implement method to create new task
        return null;
    }
    
    @Override
    public Task updateTask(Long id, Task task) {
        // TODO: Implement method to update existing task
        // TODO: Throw TaskNotFoundException if task not found
        return null;
    }
    
    @Override
    public void deleteTask(Long id) {
        // TODO: Implement method to delete task
        // TODO: Throw TaskNotFoundException if task not found
    }
}
