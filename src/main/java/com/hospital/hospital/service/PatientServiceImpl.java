package com.hospital.hospital.service;

import com.hospital.hospital.dto.PatientRequest;
import com.hospital.hospital.dto.PatientResponse;
import com.hospital.hospital.entity.Patient;
import com.hospital.hospital.entity.User;
import com.hospital.hospital.repository.PatientRepository;
import com.hospital.hospital.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired private PatientRepository patientRepository;
    @Autowired private UserRepository userRepository;

    @Override
    public PatientResponse createPatient(PatientRequest request) {
        User user = userRepository.findById(request.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        Patient patient = Patient.builder()
                .name(request.getName())
                .age(request.getAge())
                .bloodGroup(request.getBloodGroup())
                .phone(request.getPhone())
                .address(request.getAddress())
                .email(request.getEmail())
                .user(user)
                .build();

        return toResponse(patientRepository.save(patient));
    }

    @Override
    public PatientResponse getPatientById(Long id) {
        return toResponse(patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found")));
    }

    @Override
    public List<PatientResponse> getAllPatients() {
        return patientRepository.findAll()
                .stream().map(this::toResponse)
                .collect(Collectors.toList());
    }

    @Override
    public PatientResponse updatePatient(Long id, PatientRequest request) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found"));

        patient.setName(request.getName());
        patient.setAge(request.getAge());
        patient.setBloodGroup(request.getBloodGroup());
        patient.setPhone(request.getPhone());
        patient.setAddress(request.getAddress());
        patient.setEmail(request.getEmail());

        return toResponse(patientRepository.save(patient));
    }

    @Override
    public void deletePatient(Long id) {
        patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found"));
        patientRepository.deleteById(id);
    }

    private PatientResponse toResponse(Patient patient) {
        return PatientResponse.builder()
                .id(patient.getId())
                .name(patient.getName())
                .age(patient.getAge())
                .bloodGroup(patient.getBloodGroup())
                .phone(patient.getPhone())
                .address(patient.getAddress())
                .email(patient.getEmail())
                .build();
    }
}