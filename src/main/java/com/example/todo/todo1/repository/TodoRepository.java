package com.example.todo.todo1.repository;

import com.example.todo.todo1.model.Tarefas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Tarefas, String> {
}
