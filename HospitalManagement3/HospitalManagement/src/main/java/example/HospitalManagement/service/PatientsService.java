package example.HospitalManagement.service;


import org.springframework.stereotype.Service;

import example.HospitalManagement.entity.PatientsEntity;
import example.HospitalManagement.repository.PatientsRepository;

import java.util.List;

@Service
public class PatientsService {
	private final PatientsRepository patientsRepository;

    public PatientsService(PatientsRepository patientsRepository) {
        this.patientsRepository = patientsRepository;
    }

    public List<PatientsEntity> getAllPatients() {
        return patientsRepository.findAll();
    }

    public PatientsEntity getPatientById(Long id) {
        return patientsRepository.findById(id).orElse(null);
    }

    public PatientsEntity savePatient(PatientsEntity patient) {
        return patientsRepository.save(patient);
    }

    public void deletePatient(Long id) {
        patientsRepository.deleteById(id);
    }

}
