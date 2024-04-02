package ru.janeryshouse.tasklistnew.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.janeryshouse.tasklistnew.domain.task.Task;
import ru.janeryshouse.tasklistnew.domain.user.User;
import ru.janeryshouse.tasklistnew.service.TaskService;
import ru.janeryshouse.tasklistnew.service.UserService;
import ru.janeryshouse.tasklistnew.web.dto.task.TaskDto;
import ru.janeryshouse.tasklistnew.web.dto.user.UserDto;
import ru.janeryshouse.tasklistnew.web.dto.validation.OnCreate;
import ru.janeryshouse.tasklistnew.web.dto.validation.OnUpdate;
import ru.janeryshouse.tasklistnew.web.mappers.TaskMapper;
import ru.janeryshouse.tasklistnew.web.mappers.UserMapper;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Validated
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;
    private final TaskService taskService;

    private final TaskMapper taskMapper;
    private final UserMapper userMapper;


    @PutMapping
    public UserDto update(@Validated({OnUpdate.class})
                              @RequestBody UserDto dto) {
        User user  = userMapper.toEntity(dto);
        User updateUser = userService.update(user);
        return userMapper.toDto(updateUser);

    }

    @GetMapping("/{id}")
    public UserDto getById(@PathVariable Long id) {
        User user = userService.getById(id);
        return userMapper.toDto(user);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        userService.delete(id);
    }

    @GetMapping("/{id}/tasks")
    public List<TaskDto> getTaskByUserId(@PathVariable Long id) {
        List<Task> tasks = taskService.getAllByUserId(id);
        return taskMapper.toDto(tasks);
    }

    @PostMapping("/{id}/tasks")
    public TaskDto createTask(@PathVariable Long id,
                              @Validated({OnCreate.class})
                              @RequestBody TaskDto dto) {
        Task task = taskMapper.toEntity(dto);
        Task createdTask = taskService.create(task, id);
        return taskMapper.toDto(createdTask);

    }

}

















