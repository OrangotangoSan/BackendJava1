package com.example.todo.todo1.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Tarefas {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String id;

    @Column(nullable = false)
    private String tarefa;
}
