package example.HospitalManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import example.HospitalManagement.entity.AppointmentsEntity;

@Repository
public interface AppointmentsRepository extends JpaRepository<AppointmentsEntity, Long> {

}
