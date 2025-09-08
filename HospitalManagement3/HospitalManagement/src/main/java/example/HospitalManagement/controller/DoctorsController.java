package example.HospitalManagement.controller;

import example.HospitalManagement.entity.DoctorsEntity;
import example.HospitalManagement.service.DoctorsService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctors")
public class DoctorsController {
	
       private final DoctorsService doctorsService;
       
       public DoctorsController(DoctorsService doctorsService) {
    	   this.doctorsService=doctorsService;
       }
       
       @GetMapping
       public List<DoctorsEntity> getAllDoctors(){
    	   return doctorsService.getAllDoctors();
       }
       
       @GetMapping("/{id}")
       public DoctorsEntity getDoctorById(@PathVariable Long id) {
    	   return doctorsService.getDoctorById(id);
    	}
       
       @PostMapping
       public DoctorsEntity saveDoctor(@RequestBody DoctorsEntity doctor) {
    	   return doctorsService.saveDoctor(doctor);
       }
     @DeleteMapping("/{id}")
     public void deleteDoctor(@PathVariable Long id) {
    	 doctorsService.deleteDoctor(id);
     }
       }
