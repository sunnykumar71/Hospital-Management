package com.hospital.hospital.dto;
import lombok.Data;

@Data
public class PatientRequest {
    private String name;
    private int age;
    private String bloodGroup;
    private String phone;
    private String address;
    private String email;
    private Long userId;
}