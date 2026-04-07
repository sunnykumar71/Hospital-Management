package com.hospital.hospital.dto;
import lombok.Data;
import lombok.Builder;

@Data
@Builder
public class DoctorResponse {
    private Long id;
    private String name;
    private String specialization;
    private String qualification;
    private int experienceYears;
    private String email;
    private String phone;
}
