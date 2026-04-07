package com.hospital.hospital.service;

import com.hospital.hospital.dto.LoginRequest;
import com.hospital.hospital.dto.RegisterRequest;

public interface UserService {
    String register(RegisterRequest request);
    String login(LoginRequest request);
}