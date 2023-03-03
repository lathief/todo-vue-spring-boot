package com.rebel.todoapi.repository;

import com.rebel.todoapi.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
    @Query(nativeQuery = true, value = "UPDATE todo SET completed = ?2 WHERE id = ?1")
    @Modifying
    @Transactional
    void updateMark(Long id, Boolean mark);
    @Query(nativeQuery = true, value = "UPDATE todo SET value = ?2 WHERE id = ?1")
    @Modifying
    @Transactional
    void updateValue(Long id, String value);
}
