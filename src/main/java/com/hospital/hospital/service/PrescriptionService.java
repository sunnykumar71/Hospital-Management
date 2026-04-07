package com.hospital.hospital.service;
import com.hospital.hospital.dto.PrescriptionRequest;
import com.hospital.hospital.dto.PrescriptionResponse;

import java.util.List;

public interface PrescriptionService {
    PrescriptionResponse createPrescription(PrescriptionRequest request);
    PrescriptionResponse getByAppointmentId(Long appointmentId);
    List<PrescriptionResponse> getByPatientId(Long patientId);
    List<PrescriptionResponse> getByDoctorId(Long doctorId);
}