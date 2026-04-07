package com.hospital.hospital.dto;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class AppointmentRequest {
    private Long doctorId;
    private Long patientId;
    private LocalDateTime appointmentDate;
    private String reason;
}