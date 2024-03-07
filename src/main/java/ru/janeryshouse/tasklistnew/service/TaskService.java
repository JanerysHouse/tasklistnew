package ru.janeryshouse.tasklistnew.service;

import ru.janeryshouse.tasklistnew.domain.task.Task;

import java.util.List;

public interface TaskService {

    Task getById(Long id);

    List<Task> getAllByUserId(Long id);

    Task create(Task task);

    Task update(Task task);

    void delete(Long id);
}
