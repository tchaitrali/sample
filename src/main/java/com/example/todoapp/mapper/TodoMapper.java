package com.example.todoapp.mapper;

import com.example.todoapp.dto.Todo;
import com.example.todoapp.dto.TodoWithTags;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Optional;

@Mapper
public interface TodoMapper {
    void insert(Todo todo);

    List<Todo> list(int limit, long offset, Boolean completed);

    List<TodoWithTags> listWithTags(Boolean completed, int limit, long offset);

    Optional<Todo> get(long todoId);

    Optional<TodoWithTags> getWithTags(long todoId);

    boolean update(Todo todo);

    boolean delete(long todoId);

    void deleteAll();
}
