package com.hospital.hospital.dto;
import lombok.Data;
import lombok.Builder;
import java.time.LocalDate;

@Data
@Builder
public class PrescriptionResponse {
    private Long id;
    private Long appointmentId;
    private String doctorName;
    private String patientName;
    private String medicines;
    private String notes;
    private LocalDate issuedDate;
}