package com.hospital.hospital.dto;
import com.hospital.hospital.entity.Role;
import lombok.Data;

@Data
public class RegisterRequest {
    private String username;
    private String password;
    private Role role;
}