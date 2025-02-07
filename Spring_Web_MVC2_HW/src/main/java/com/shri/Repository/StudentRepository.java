package com.shri.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shri.Entity.Student;
import java.util.List;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	List<Student> findByName(String name);
}
