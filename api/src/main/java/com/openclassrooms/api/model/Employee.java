package com.openclassrooms.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Setter
	@Getter
	private Long id;
	
	@Column(name="first_name")
	@Setter
	@Getter
	private String firstName;
	
	@Column(name="last_name")
	@Setter
	@Getter
	private String lastName;
	
	@Column(name="mail")
	@Setter
	@Getter
	private String mail;
	
	@Column(name="password")
	@Setter
	@Getter
	private String password;
	
}
