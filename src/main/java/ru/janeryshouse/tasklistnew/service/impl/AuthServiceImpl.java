package ru.janeryshouse.tasklistnew.service.impl;

import org.springframework.stereotype.Service;
import ru.janeryshouse.tasklistnew.service.AuthService;
import ru.janeryshouse.tasklistnew.web.dto.auth.JwtRequest;
import ru.janeryshouse.tasklistnew.web.dto.auth.JwtResponse;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public JwtResponse login(JwtRequest loginRequest) {
        return null;
    }

    @Override
    public JwtResponse refresh(String refreshToken) {
        return null;
    }
}
