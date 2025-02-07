package com.shri.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.shri.Entity.Student;
import com.shri.Repository.StudentRepository;

@org.springframework.stereotype.Controller
public class Controller {  

    @Autowired
    StudentRepository stud;

    @GetMapping("/")
    public String home()
    {
    	return "DashBoard";
    }
    
    @GetMapping("/profile")
    public String profile()
    {
    	return "profile";
    }
    
    
    @GetMapping("/submit")
    public String submit(@RequestParam(value = "name", required = false) String name,
                       @RequestParam(value = "email", required = false) String email,
                       @RequestParam(value = "gender", required = false) String gender,
                       @RequestParam(value = "course", required = false) String course,
                       Model model) 
    {
        try {
            if (name == null || email == null || gender == null || course == null) {
                throw new Exception("Missing required parameters.");
            }

            // Save student data
            Student s = new Student(name, email, gender, course);
            Student savedStudent = stud.save(s);
            System.out.println("Data Saved: " + savedStudent);

            // Pass student data to the view
            model.addAttribute("name", name);
            model.addAttribute("email", email);
            model.addAttribute("gender", gender);
            model.addAttribute("course", course);
            model.addAttribute("msg", "Saved Data..");

            return "Student_Data";  
        } catch (Exception e) {
            model.addAttribute("errorMessage", e.getMessage());
            return "MissingData"; // Redirect to error.jsp
        }
    }
    
    @GetMapping("/show_data")
    public String show_data()
    {
    	return "Student_Data";
    }
}
