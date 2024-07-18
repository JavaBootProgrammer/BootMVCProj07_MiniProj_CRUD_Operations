package com.nt.model;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class Employee implements Serializable{

	@Id
	private Integer employeeNo;
	private String employeeName;
	private String job;
	private String salary;
	private String dept;
}
