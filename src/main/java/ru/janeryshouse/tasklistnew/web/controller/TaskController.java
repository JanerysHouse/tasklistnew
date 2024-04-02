package ru.janeryshouse.tasklistnew.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.janeryshouse.tasklistnew.domain.task.Task;
import ru.janeryshouse.tasklistnew.service.TaskService;
import ru.janeryshouse.tasklistnew.web.dto.task.TaskDto;
import ru.janeryshouse.tasklistnew.web.dto.validation.OnUpdate;
import ru.janeryshouse.tasklistnew.web.mappers.TaskMapper;

@RestController
@RequestMapping("/api/v1/task")
@RequiredArgsConstructor
@Validated
public class TaskController {

    private final TaskService taskService;
    private final TaskMapper taskMapper;

    @GetMapping("/{id}")
    public TaskDto getById(@PathVariable Long id) {
        Task task = taskService.getById(id);
        return taskMapper.toDto(task);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        taskService.delete(id);
    }

    @PutMapping
    public TaskDto update(@Validated(OnUpdate.class) @RequestBody TaskDto dto) {
        Task task = taskMapper.toEntity(dto);
        Task updateTask = taskService.update(task);
        return taskMapper.toDto(updateTask);
    }
}
