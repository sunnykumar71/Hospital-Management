package com.hospital.hospital.dto;
import lombok.Data;

@Data
public class DoctorRequest {
    private String name;
    private String specialization;
    private String qualification;
    private int experienceYears;
    private String email;
    private String phone;
    private Long userId;
}