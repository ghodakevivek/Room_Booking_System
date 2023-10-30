package com.example.roombooking.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="admin_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {

	@Id   // Primary key
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int adminId;
	private String adminFirstName;
	private String adminLastName;
	private String adminMobile;
	private String adminEmail;
	private String adminCountry;
	private String adminCity;
	private String adminUserName;
	private String adminPassword;
	private String adminAddress;
	
}
