package com.example.taskmanager.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private boolean completed;

    // Getter para el campo 'id'
    public Long getId() {
        return id;
    }

    // Setter para el campo 'id'
    public void setId(Long id) {
        this.id = id;
    }

    // Getter para el campo 'description'
    public String getDescription() {
        return description;
    }

    // Setter para el campo 'description'
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter para el campo 'completed'
    public boolean isCompleted() {
        return completed;
    }

    // Setter para el campo 'completed'
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

}
