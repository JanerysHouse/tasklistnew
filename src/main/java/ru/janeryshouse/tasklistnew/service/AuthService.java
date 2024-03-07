package ru.janeryshouse.tasklistnew.service;

public interface AuthService {

    JwtResponce login(JwtRequest loginRequest);
    JwtResponce refresh(String refreshToken);
}
