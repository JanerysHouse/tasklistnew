package ru.janeryshouse.tasklistnew.web.mappers;

import org.mapstruct.Mapper;
import ru.janeryshouse.tasklistnew.domain.task.Task;
import ru.janeryshouse.tasklistnew.web.dto.task.TaskDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    TaskDto toDto(Task task);

    List<TaskDto> toDto(List<Task> tasks);

    Task toEntity(TaskDto dto);
}
