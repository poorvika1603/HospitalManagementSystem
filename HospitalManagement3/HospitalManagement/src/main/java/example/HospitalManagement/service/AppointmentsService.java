package example.HospitalManagement.service;


import org.springframework.stereotype.Service;

import example.HospitalManagement.entity.AppointmentsEntity;
import example.HospitalManagement.repository.AppointmentsRepository;

import java.util.List;
@Service
public class AppointmentsService {
	private final AppointmentsRepository appointmentsRepository;

    public AppointmentsService(AppointmentsRepository appointmentsRepository) {
        this.appointmentsRepository = appointmentsRepository;
    }

    public List<AppointmentsEntity> getAllAppointments() {
        return appointmentsRepository.findAll();
    }

    public AppointmentsEntity getAppointmentById(Long id) {
        return appointmentsRepository.findById(id).orElse(null);
    }

    public AppointmentsEntity saveAppointment(AppointmentsEntity appointment) {
        return appointmentsRepository.save(appointment);
    }

    public void deleteAppointment(Long id) {
        appointmentsRepository.deleteById(id);
    }

}
