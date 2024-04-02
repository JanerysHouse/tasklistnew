package ru.janeryshouse.tasklistnew.web.dto.task;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;
import ru.janeryshouse.tasklistnew.domain.task.Status;
import ru.janeryshouse.tasklistnew.web.dto.validation.OnCreate;
import ru.janeryshouse.tasklistnew.web.dto.validation.OnUpdate;

import java.time.LocalDateTime;

@Data
public class TaskDto {

    @NotNull(message = "Id must be not null.", groups = OnUpdate.class)
    private Long id;

    @NotNull(message = "Title must be not null.", groups = {OnCreate.class, OnUpdate.class})
    @Length(max = 255, message = "Title length must be smaller than 255 symbols.", groups = {OnCreate.class, OnUpdate.class})
    private String title;

    @Length(max = 255, message = "Description length must be smaller than 255 symbols.", groups = {OnCreate.class, OnUpdate.class})
    private String description;
    private Status status;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalDateTime expirationDate;
}
