package com.shri.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shri.Entity.Employee;
import com.shri.Entity.Repository.EmployeeRepository;

@Controller
public class Controler {

    @Autowired
    EmployeeRepository emp;

   @GetMapping("/")
    public String loadform(@RequestParam("id") int id,Model model) {
	   Optional<Employee> byId = emp.findById(id);
	   if(byId.isPresent())
	   {
		   Employee employee = byId.get();
		   model.addAttribute("msg", employee);
	   }
        return "profile";
    }
}

