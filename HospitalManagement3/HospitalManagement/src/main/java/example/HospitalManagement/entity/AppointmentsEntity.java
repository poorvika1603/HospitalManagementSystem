package example.HospitalManagement.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "appointments")
public class AppointmentsEntity {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;

 @ManyToOne
 private DoctorsEntity doctor;
 
 @ManyToOne
 private PatientsEntity patient;
 
 private LocalDateTime appointmentDate;

 public long getId() {
	return id;
 }

 public void setId(long id) {
	this.id = id;
 }

 public DoctorsEntity getDoctor() {
	return doctor;
 }

 public void setDoctor(DoctorsEntity doctor) {
	this.doctor = doctor;
 }

 public PatientsEntity getPatient() {
	return patient;
 }

 public void setPatient(PatientsEntity patient) {
	this.patient = patient;
 }

 public LocalDateTime getAppointmentDate() {
	return appointmentDate;
 }

 public void setAppointmentDate(LocalDateTime appointmentDate) {
	this.appointmentDate = appointmentDate;
 }
 
 
}
