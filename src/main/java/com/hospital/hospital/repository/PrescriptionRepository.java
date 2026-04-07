package com.hospital.hospital.repository;
import com.hospital.hospital.entity.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.util.List;

public interface PrescriptionRepository extends JpaRepository<Prescription, Long> {
    Optional<Prescription> findByAppointmentId(Long appointmentId);
    List<Prescription> findByAppointmentPatientId(Long patientId);
    List<Prescription> findByAppointmentDoctorId(Long doctorId);
}