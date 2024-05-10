package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Service.EmployeeService;
import com.example.entity.PersonalDetails;

@Controller
public class personalController {

	@Autowired
	private EmployeeService employeeService;
	
	 @GetMapping("/")
	    public String showPersonalForm(Model model) {
	        model.addAttribute("personalDetails", new PersonalDetails());
	        return "personalDetails";
	    }
	 
   @PostMapping("/employee/personal")
   public String savePersonalDetails(@ModelAttribute("personalDetails") PersonalDetails personalDetails,Model model) {
employeeService.createEmployeePersonal(personalDetails);
model.addAttribute("employeeId", personalDetails.getEmployeeId());
       return "redirect:/employee/professional"; // Redirect to the professional details form
   }
	 
}
