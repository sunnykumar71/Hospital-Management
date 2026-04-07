package com.hospital.hospital.dto;
import com.hospital.hospital.entity.AppointmentStatus;
import lombok.Data;
import lombok.Builder;
import java.time.LocalDateTime;

@Data
@Builder
public class AppointmentResponse {
    private Long id;
    private String doctorName;
    private String patientName;
    private LocalDateTime appointmentDate;
    private AppointmentStatus status;
    private String reason;
}