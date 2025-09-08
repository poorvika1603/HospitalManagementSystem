package example.HospitalManagement.service;



import example.HospitalManagement.entity.DoctorsEntity;
import example.HospitalManagement.repository.DoctorsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DoctorsService {
	@Autowired
	 private final DoctorsRepository doctorsRepository;

	    public DoctorsService(DoctorsRepository doctorsRepository) {
	        this.doctorsRepository = doctorsRepository;
	    }

	    public List<DoctorsEntity> getAllDoctors() {
	        return doctorsRepository.findAll();
	    }

	    public DoctorsEntity getDoctorById(Long id) {
	        return doctorsRepository.findById(id).orElse(null);
	    }

	    public DoctorsEntity saveDoctor(DoctorsEntity doctor) {
	        return doctorsRepository.save(doctor);
	    }

	    public void deleteDoctor(Long id) {
	        doctorsRepository.deleteById(id);
	    }

}
