package com.hospital.hospital.service;

import com.hospital.hospital.dto.AppointmentRequest;
import com.hospital.hospital.dto.AppointmentResponse;
import java.util.List;

public interface AppointmentService {
    AppointmentResponse bookAppointment(AppointmentRequest request);
    AppointmentResponse getAppointmentById(Long id);
    List<AppointmentResponse> getAppointmentsByDoctor(Long doctorId);
    List<AppointmentResponse> getAppointmentsByPatient(Long patientId);
    AppointmentResponse updateStatus(Long id, String status);
    void cancelAppointment(Long id);
}