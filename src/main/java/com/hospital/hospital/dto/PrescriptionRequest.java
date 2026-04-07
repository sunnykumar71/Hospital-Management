package com.hospital.hospital.dto;
import lombok.Data;

@Data
public class PrescriptionRequest {
    private Long appointmentId;
    private String medicines;
    private String notes;
}