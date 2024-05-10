package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class ProfessionalDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private Long employeeId;
    private String jobRole;
    private String mail;

    public ProfessionalDetails(){

    }

    public ProfessionalDetails(Long id, Long employeeId, String jobRole, String mail) {
        Id = id;
        this.employeeId = employeeId;
        this.jobRole = jobRole;
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "ProfessionalDetails{" +
                "Id=" + Id +
                ", employeeId=" + employeeId +
                ", jobRole='" + jobRole + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
