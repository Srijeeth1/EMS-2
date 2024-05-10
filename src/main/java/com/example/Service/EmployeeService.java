package com.example.Service;

import com.example.entity.PersonalDetails;
import com.example.entity.ProfessionalDetails;

public interface EmployeeService {
	public PersonalDetails createEmployeePersonal(PersonalDetails personalDetails);
    public ProfessionalDetails createEmployeeProfessional(ProfessionalDetails professionalDetails);

}
