package com.hospital.hospital.service;
import com.hospital.hospital.dto.PrescriptionRequest;
import com.hospital.hospital.dto.PrescriptionResponse;
import com.hospital.hospital.entity.Appointment;
import com.hospital.hospital.entity.Prescription;
import com.hospital.hospital.repository.AppointmentRepository;
import com.hospital.hospital.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PrescriptionServiceImpl implements PrescriptionService {

    @Autowired private PrescriptionRepository prescriptionRepository;
    @Autowired private AppointmentRepository appointmentRepository;

    @Override
    public PrescriptionResponse createPrescription(PrescriptionRequest request) {
        Appointment appointment = appointmentRepository.findById(request.getAppointmentId())
                .orElseThrow(() -> new RuntimeException("Appointment not found"));

        Prescription prescription = Prescription.builder()
                .appointment(appointment)
                .medicines(request.getMedicines())
                .notes(request.getNotes())
                .issuedDate(LocalDate.now())
                .build();

        return toResponse(prescriptionRepository.save(prescription));
    }

    @Override
    public PrescriptionResponse getByAppointmentId(Long appointmentId) {
        return toResponse(prescriptionRepository.findByAppointmentId(appointmentId)
                .orElseThrow(() -> new RuntimeException("Prescription not found")));
    }

    @Override
    public List<PrescriptionResponse> getByPatientId(Long patientId) {
        return prescriptionRepository.findByAppointmentPatientId(patientId)
                .stream().map(this::toResponse).collect(Collectors.toList());
    }

    @Override
    public List<PrescriptionResponse> getByDoctorId(Long doctorId) {
        return prescriptionRepository.findByAppointmentDoctorId(doctorId)
                .stream().map(this::toResponse).collect(Collectors.toList());
    }

    private PrescriptionResponse toResponse(Prescription p) {
        return PrescriptionResponse.builder()
                .id(p.getId())
                .appointmentId(p.getAppointment().getId())
                .doctorName(p.getAppointment().getDoctor().getName())
                .patientName(p.getAppointment().getPatient().getName())
                .medicines(p.getMedicines())
                .notes(p.getNotes())
                .issuedDate(p.getIssuedDate())
                .build();
    }
}