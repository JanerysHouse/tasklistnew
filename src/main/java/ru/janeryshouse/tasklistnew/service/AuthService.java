package ru.janeryshouse.tasklistnew.service;

import ru.janeryshouse.tasklistnew.web.dto.auth.JwtRequest;
import ru.janeryshouse.tasklistnew.web.dto.auth.JwtResponse;

public interface AuthService {

    JwtResponse login(JwtRequest loginRequest);
    JwtResponse refresh(String refreshToken);
}
