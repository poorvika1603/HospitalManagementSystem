package example.HospitalManagement.controller;

import example.HospitalManagement.entity.PatientsEntity;
import example.HospitalManagement.service.PatientsService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientsController {
	private final PatientsService patientsService;
	
    public PatientsController(PatientsService patientsService) {
        this.patientsService = patientsService;
    }
@GetMapping
public List<PatientsEntity> getAllPatients(){
	return patientsService.getAllPatients();
}

@GetMapping("/{id}")
public PatientsEntity getPatientById(@PathVariable Long id) {
	return patientsService.getPatientById(id);
}

@PostMapping
public PatientsEntity savePatient(@RequestBody PatientsEntity patient) {
	return patientsService.savePatient(patient);
}

@DeleteMapping("/{id}")
public void deletePatient(@PathVariable Long id) {
	patientsService.deletePatient(id);
}

}
