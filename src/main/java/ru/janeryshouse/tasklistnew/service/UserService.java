package ru.janeryshouse.tasklistnew.service;

import ru.janeryshouse.tasklistnew.domain.user.User;

public interface UserService {

    User getById(Long id);

    User getByUsername(String username);

    User update(User user);

    User create(User user);

    boolean isTaskOwner(Long userId, Long taskId);

    void delete(Long id);
}
