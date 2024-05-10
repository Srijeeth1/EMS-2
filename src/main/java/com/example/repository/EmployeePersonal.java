package com.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.PersonalDetails;

public interface EmployeePersonal extends JpaRepository<PersonalDetails, Long> {

}
