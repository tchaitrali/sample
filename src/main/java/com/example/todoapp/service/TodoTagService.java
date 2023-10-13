package com.example.todoapp.service;

import com.example.todoapp.dto.TodoWithTags;

import java.util.List;

public interface TodoTagService {
    TodoWithTags insertTodoWithTags(TodoWithTags todo);

    List<TodoWithTags> listTodosWithTags(Boolean completed, int limit, long offset);

    TodoWithTags getTodoWithTags(long todoId);

    void addTag(long todoId, String tagName);

    void deleteTag(long todoId, String tagName);
}
