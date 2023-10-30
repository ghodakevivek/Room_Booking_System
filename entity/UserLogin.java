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
@Table(name="userLogin_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLogin {

	@Id  // Primary key
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userLoginId;
	private String userUserName;
	private String userPassword;
}
