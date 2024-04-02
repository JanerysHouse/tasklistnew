package ru.janeryshouse.tasklistnew.web.mappers;

import org.mapstruct.Mapper;
import ru.janeryshouse.tasklistnew.domain.user.User;
import ru.janeryshouse.tasklistnew.web.dto.user.UserDto;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDto(User user);

    User toEntity(UserDto dto);
}
