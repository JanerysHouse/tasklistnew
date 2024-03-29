package ru.janeryshouse.tasklistnew.repositories;

import ru.janeryshouse.tasklistnew.domain.task.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepository  {

    Optional<Task> findById(Long id);
    List<Task> findAllByUserId(Long userId);

    void assignToUserById(Long taskId, Long userId);
    void create(Task task);
    void update(Task task);
    void delete(Long id);
}
