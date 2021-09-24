package com.spring_rest.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tbl_employees")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	private Long id;
	
	private String name;
	
	private  String department;
	
	private String location;
}
