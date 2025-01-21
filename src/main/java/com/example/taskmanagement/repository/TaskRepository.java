package com.example.taskmanagement.repository;

import com.example.taskmanagement.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    // Additional custom queries can be added here if needed
}
