package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Service.EmployeeService;
import com.example.entity.ProfessionalDetails;

@Controller
public class professionalController {
	@Autowired
	private EmployeeService employeeService;
	

    @GetMapping("/employee/professional")
    public String showProfessionalForm(Model model, @RequestParam(value = "employeeId", required = false) Long employeeId) {
        if (employeeId == null) {
            return "redirect:/"; // Redirect to the personal details form if employeeId is not present
        }
        model.addAttribute("professionalDetails", new ProfessionalDetails());
        model.addAttribute("employeeId", employeeId); // Add employeeId to model
        return "professionalDetails";
    }

    @PostMapping("/save")
    public String saveProfessionalDetails(@ModelAttribute("professionalDetails") ProfessionalDetails professionalDetails, Model model) {
        Long employeeId = (Long) model.asMap().get("employeeId"); // Retrieve employeeId from model
        professionalDetails.setEmployeeId(employeeId); // Set employeeId in ProfessionalDetails entity
        employeeService.createEmployeeProfessional(professionalDetails);
        return "redirect:/success";
    }
}
