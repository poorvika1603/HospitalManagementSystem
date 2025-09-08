package example.HospitalManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import example.HospitalManagement.entity.PatientsEntity;

@Repository
public interface PatientsRepository extends JpaRepository<PatientsEntity,Long> {

}
