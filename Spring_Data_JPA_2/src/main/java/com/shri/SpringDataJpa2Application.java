package com.shri;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.shri.Entity.Employee;
import com.shri.Repository.EmployeeRepository;

@SpringBootApplication
public class SpringDataJpa2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpa2Application.class, args);
	}
	
	@Autowired
	EmployeeRepository emp;
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		Employee e1 = new Employee("Shreyas", "HR", 25000);
		Employee e2 = new Employee("Tejas", "HR", 2000);
		Employee e3 = new Employee("Kartikey", "Sales", 50000);
		Employee e4 = new Employee("Om", "IT", 25045);
		Employee e5 = new Employee("Aarav", "Finance", 42000);
		Employee e6 = new Employee("Mihir", "Marketing", 31000);
		Employee e7 = new Employee("Siddharth", "HR", 27000);
		Employee e8 = new Employee("Ananya", "IT", 48000);
		Employee e9 = new Employee("Neha", "Finance", 35000);
		Employee e10 = new Employee("Aditya", "Sales", 23000);
		Employee e11 = new Employee("Rohan", "HR", 28000);
		Employee e12 = new Employee("Priya", "Marketing", 37000);
		Employee e13 = new Employee("Tanvi", "IT", 52000);
		Employee e14 = new Employee("Aryan", "Finance", 40000);
		Employee e15 = new Employee("Ishaan", "Sales", 46000);
		Employee e16 = new Employee("Vedant", "HR", 22000);
		Employee e17 = new Employee("Swara", "Marketing", 29000);
		Employee e18 = new Employee("Krishna", "IT", 34000);
		Employee e19 = new Employee("Ritika", "Finance", 41000);
		Employee e20 = new Employee("Vivek", "Sales", 27500);
		Employee e21 = new Employee("Meera", "HR", 24500);
		Employee e22 = new Employee("Kabir", "Marketing", 38000);
		Employee e23 = new Employee("Gauri", "IT", 53000);
		Employee e24 = new Employee("Saanvi", "Finance", 31500);
		Employee e25 = new Employee("Lakshya", "Sales", 29500);
		Employee e26 = new Employee("Ishika", "HR", 26000);
		Employee e27 = new Employee("Harsh", "Marketing", 32000);
		Employee e28 = new Employee("Tanya", "IT", 44000);
		Employee e29 = new Employee("Dev", "Finance", 33000);
		Employee e30 = new Employee("Rohit", "Sales", 51000);
		Employee e31 = new Employee("Yash", "HR", 28000);
		Employee e32 = new Employee("Esha", "Marketing", 30000);
		Employee e33 = new Employee("Nikhil", "IT", 55000);
		Employee e34 = new Employee("Palak", "Finance", 38000);
		Employee e35 = new Employee("Raj", "Sales", 22500);
		Employee e36 = new Employee("Simran", "HR", 27000);
		Employee e37 = new Employee("Aditi", "Marketing", 39000);
		Employee e38 = new Employee("Varun", "IT", 49000);
		Employee e39 = new Employee("Rhea", "Finance", 36000);
		Employee e40 = new Employee("Arjun", "Sales", 24000);
		Employee e41 = new Employee("Kavya", "HR", 26000);
		Employee e42 = new Employee("Samar", "Marketing", 33000);
		Employee e43 = new Employee("Ira", "IT", 52000);
		Employee e44 = new Employee("Omkar", "Finance", 40000);
		Employee e45 = new Employee("Parth", "Sales", 27000);
		Employee e46 = new Employee("Pooja", "HR", 29000);
		Employee e47 = new Employee("Manav", "Marketing", 31000);
		Employee e48 = new Employee("Siddhi", "IT", 50000);
		Employee e49 = new Employee("Aman", "Finance", 35000);
		Employee e50 = new Employee("Mansi", "Sales", 28000);
		Employee e51 = new Employee("Raghav", "HR", 25000);
		Employee e52 = new Employee("Sneha", "Marketing", 34500);
		Employee e53 = new Employee("Dhruv", "IT", 46000);
		Employee e54 = new Employee("Anushka", "Finance", 33000);
		Employee e55 = new Employee("Tushar", "Sales", 38000);
		Employee e56 = new Employee("Jiya", "HR", 29000);
		Employee e57 = new Employee("Atharva", "Marketing", 32000);
		Employee e58 = new Employee("Rehan", "IT", 54000);
		Employee e59 = new Employee("Akash", "Finance", 36500);
		Employee e60 = new Employee("Avni", "Sales", 31000);
		Employee e61 = new Employee("Zara", "HR", 26000);
		Employee e62 = new Employee("Hitesh", "Marketing", 37000);
		Employee e63 = new Employee("Farhan", "IT", 48000);
		Employee e64 = new Employee("Bhavya", "Finance", 39000);
		Employee e65 = new Employee("Jatin", "Sales", 25000);
		Employee e66 = new Employee("Kritika", "HR", 27500);
		Employee e67 = new Employee("Divya", "Marketing", 34500);
		Employee e68 = new Employee("Saurabh", "IT", 53000);
		Employee e69 = new Employee("Sakshi", "Finance", 31000);
		Employee e70 = new Employee("Shivam", "Sales", 36000);
		Employee e71 = new Employee("Mehul", "HR", 24000);
		Employee e72 = new Employee("Pranav", "Marketing", 35000);
		Employee e73 = new Employee("Anjali", "IT", 47000);
		Employee e74 = new Employee("Rachit", "Finance", 34000);
		Employee e75 = new Employee("Nisha", "Sales", 23000);
		Employee e76 = new Employee("Pankaj", "HR", 26000);
		Employee e77 = new Employee("Bhavesh", "Marketing", 38000);
		Employee e78 = new Employee("Harini", "IT", 52000);
		Employee e79 = new Employee("Yuvraj", "Finance", 42000);
		Employee e80 = new Employee("Karan", "Sales", 31000);
		Employee e81 = new Employee("Deepika", "HR", 28000);
		Employee e82 = new Employee("Ishwar", "Marketing", 39000);
		Employee e83 = new Employee("Mahima", "IT", 45000);
		Employee e84 = new Employee("Neeraj", "Finance", 35000);
		Employee e85 = new Employee("Suraj", "Sales", 27000);
		Employee e86 = new Employee("Priyanka", "HR", 26000);
		Employee e87 = new Employee("Ramesh", "Marketing", 33000);
		Employee e88 = new Employee("Sonia", "IT", 50000);
		Employee e89 = new Employee("Arvind", "Finance", 42000);
		Employee e90 = new Employee("Bharti", "Sales", 28000);
		Employee e91 = new Employee("Nitin", "HR", 25000);
		Employee e92 = new Employee("Gaurav", "Marketing", 32000);
		Employee e93 = new Employee("Sujata", "IT", 49000);
		Employee e94 = new Employee("Rajesh", "Finance", 39000);
		Employee e95 = new Employee("Rupali", "Sales", 30000);
		Employee e96 = new Employee("Sunil", "HR", 28000);
		Employee e97 = new Employee("Ankita", "Marketing", 41000);
		Employee e98 = new Employee("Vipul", "IT", 46000);
		Employee e99 = new Employee("Harsha", "Finance", 38000);
		Employee e100 = new Employee("Kushal", "Sales", 27000);

		
		emp.saveAll(Arrays.asList(
			    e1, e2, e3, e4, e5, e6, e7, e8, e9, e10,
			    e11, e12, e13, e14, e15, e16, e17, e18, e19, e20,
			    e21, e22, e23, e24, e25, e26, e27, e28, e29, e30,
			    e31, e32, e33, e34, e35, e36, e37, e38, e39, e40,
			    e41, e42, e43, e44, e45, e46, e47, e48, e49, e50,
			    e51, e52, e53, e54, e55, e56, e57, e58, e59, e60,
			    e61, e62, e63, e64, e65, e66, e67, e68, e69, e70,
			    e71, e72, e73, e74, e75, e76, e77, e78, e79, e80,
			    e81, e82, e83, e84, e85, e86, e87, e88, e89, e90,
			    e91, e92, e93, e94, e95, e96, e97, e98, e99, e100
			));
			
			*/
		
//		 List<Employee> all = emp.findAll();
//		 all.forEach(System.err::println);
		 
	
		
		/*
		//Pagination
		PageRequest of = PageRequest.of(1, 20);  //0:1-20,1:20-30
		Page<Employee> all = emp.findAll(of);
		all.forEach(System.err::println);
		
		*/
		
		/*
		 Sorting...
		
		List<Employee> all = emp.findAll(org.springframework.data.domain.Sort.by("sal").ascending());
		all.forEach(System.err::println);
		
		
		List<Employee> all1 = emp.findAll(org.springframework.data.domain.Sort.by("sal").descending());
		all1.forEach(System.err::println);
		*/
			
		
//		Employee e=new Employee();
//		e.setName("shreyas");
//		
//		List<Employee> all = emp.findAll(Example.of(e));
//		all.forEach(System.err::println);
		
		
		/*
		 //Custom Querys
		 List<Employee> s = emp.findBySalLessThan(10000);
		 s.forEach(System.err::println);
		
		List<Employee> byNameStartsWith = emp.findByNameStartsWith("S");
		byNameStartsWith.forEach(System.err::println);
		
		List<Employee> byNameEndsWith = emp.findByNameEndsWith("m");
		byNameEndsWith.forEach(System.err::println);
		
		
		List<Employee> bySalLessThanEqual = emp.findBySalLessThanEqual(50000);
		bySalLessThanEqual.forEach(System.err::println);
		
		
		List<Employee> byDept = emp.findByDept("IT");
		byDept.forEach(System.err::println);
		
		
		List<Employee> bySalBetween = emp.findBySalBetween(1000,10000);
		bySalBetween.forEach(System.err::println);
		
		*/
		
		
		
//		List<Employee> top3ByOrderBySalAsc = emp.findTop3ByOrderBySalAsc();
//		top3ByOrderBySalAsc.forEach(System.err::println);
		
//		List<Employee> top3ByOrderBySalDesc = emp.findTop3ByOrderBySalDesc();
//		top3ByOrderBySalDesc.forEach(System.err::println);
		
		List<Employee> byNameContains = emp.findByNameContains("s");
		byNameContains.forEach(System.err::println);
		
//		List<Employee> byNameAndSalOrderById = emp.findByNameAndSalOrderById("Shhreyas",12);
//		byNameAndSalOrderById.forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
	}

}
