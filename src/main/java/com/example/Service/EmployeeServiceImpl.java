package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.PersonalDetails;
import com.example.entity.ProfessionalDetails;
import com.example.repository.EmployeePersonal;
import com.example.repository.EmployeeProfessional;
@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeePersonal employeePersonal;
	
	@Autowired
	private EmployeeProfessional employeeProfessional;
	
	@Override
	public PersonalDetails createEmployeePersonal(PersonalDetails personalDetails) {
		
		return employeePersonal.save(personalDetails);
	}

	@Override
	public ProfessionalDetails createEmployeeProfessional(ProfessionalDetails professionalDetails) {
		return employeeProfessional.save(professionalDetails);
	}

}
