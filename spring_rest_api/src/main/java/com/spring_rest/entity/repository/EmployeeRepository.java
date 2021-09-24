package com.spring_rest.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring_rest.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
}
