package com.shri.Entity.Repository.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.shri.Entity.Employee;
import com.shri.Entity.Repository.EmployeeRepository;



@org.springframework.stereotype.Controller
public class Controller {

	
	@Autowired
	EmployeeRepository emp;
	
	@GetMapping("/")
	public String home(Model model)
	{
		Employee employee=new Employee();
//		employee.setName("Shreyas");
		
		model.addAttribute("employee", employee);
		
		return "Employee_Info";
	}
	
	@PostMapping("/save")
	public String Save(Employee employee,Model model)
	{
		
		if(employee.getName()==null||employee.getEmail()==null||employee.getGender()==null||employee.getShift_Timing()==null||employee.getDesignation()==null)
		{
			System.out.println("Please Proviide Parameters");
		
		}
		else
		{
			emp.save(employee);
		}
		return "Employee_Info";
	}

}
