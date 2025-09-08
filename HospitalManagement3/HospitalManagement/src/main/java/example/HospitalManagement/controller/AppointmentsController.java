package example.HospitalManagement.controller;

import example.HospitalManagement.entity.AppointmentsEntity;
import example.HospitalManagement.service.AppointmentsService;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentsController {
	
	private final AppointmentsService appointmentsService;
	
	public AppointmentsController(AppointmentsService appointmentsService) {
		this.appointmentsService=appointmentsService;
	}

	@GetMapping
	public List<AppointmentsEntity> getAllAppointments(){
		return appointmentsService.getAllAppointments();
	}
	
    @GetMapping("/{id}")
    public AppointmentsEntity getAppointmentById(@PathVariable Long id) {
    	return appointmentsService.getAppointmentById(id);
    }
    
    @PostMapping
    public AppointmentsEntity saveAppointment(@RequestBody AppointmentsEntity appointment) {
    	return appointmentsService.saveAppointment(appointment);
   }
    
    @DeleteMapping("/{id}")
    public void deleteAppointment(@PathVariable Long id) {
    	appointmentsService.deleteAppointment(id);
    }
}
