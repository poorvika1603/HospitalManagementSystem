package example.HospitalManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import example.HospitalManagement.entity.DoctorsEntity;


@Repository
public interface DoctorsRepository extends JpaRepository<DoctorsEntity, Long> {

}
