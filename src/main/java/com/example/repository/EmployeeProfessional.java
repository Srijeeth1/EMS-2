package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.ProfessionalDetails;

public interface EmployeeProfessional extends JpaRepository<ProfessionalDetails, Long>{

}
