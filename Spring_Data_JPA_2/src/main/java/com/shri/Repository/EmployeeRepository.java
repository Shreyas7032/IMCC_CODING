package com.shri.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shri.Entity.Employee;
import java.util.List;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	
				List<Employee> findBySalLessThan(double sal);
				
				List<Employee> findByNameStartsWith(String name);
				
				List<Employee> findByNameEndsWith(String name);
				
				List<Employee> findBySalLessThanEqual(double sal);
				
				List<Employee> findByDept(String dept);
				
				List<Employee> findBySalBetween(double min,double max);
				
				 List<Employee> findTop3ByOrderBySalDesc();
				 
				 List<Employee> findTop3ByOrderBySalAsc();
				 
				 List<Employee> findByNameContains(String letter);
				 
				 List<Employee> findByNameAndSalOrderById(String name,int id);
				 
				
				 
				 
				 
}
