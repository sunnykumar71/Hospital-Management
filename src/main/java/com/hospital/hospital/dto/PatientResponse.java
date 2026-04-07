package com.hospital.hospital.dto;
import lombok.Data;
import lombok.Builder;

@Data
@Builder
public class PatientResponse {
    private Long id;
    private String name;
    private int age;
    private String bloodGroup;
    private String phone;
    private String address;
    private String email;
}
