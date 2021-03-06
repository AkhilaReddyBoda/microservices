package com.patient.patientservice.models;

public class DoctorDTO {

	public Long doctor_id;

	public String doctor_name;

	public Long hospital_id;

	public DoctorDTO() {
		super();
	}

	public Long getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(Long doctor_id) {
		this.doctor_id = doctor_id;
	}

	public String getDoctor_name() {
		return doctor_name;
	}

	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}

	public Long getHospital_id() {
		return hospital_id;
	}

	public void setHospital_id(Long hospital_id) {
		this.hospital_id = hospital_id;
	}

}
