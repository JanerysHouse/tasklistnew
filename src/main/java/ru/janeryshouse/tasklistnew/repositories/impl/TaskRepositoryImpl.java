package ru.janeryshouse.tasklistnew.repositories.impl;

import org.springframework.stereotype.Repository;
import ru.janeryshouse.tasklistnew.domain.task.Task;
import ru.janeryshouse.tasklistnew.repositories.TaskRepository;

import java.util.List;
import java.util.Optional;

@Repository
public class TaskRepositoryImpl implements TaskRepository {

    @Override
    public Optional<Task> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Task> findAllByUserId(Long userId) {
        return null;
    }

    @Override
    public void assignToUserById(Long taskId, Long userId) {

    }

    @Override
    public void create(Task task) {

    }

    @Override
    public void update(Task task) {

    }

    @Override
    public void delete(Long id) {

    }
}
