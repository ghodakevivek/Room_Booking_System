package com.example.roombooking.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="user_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	
	@Id  // Primary key
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int userId;
	private String userFirstName;
	private String userLastName;
	private String userAadhar;
	private String userCity;
	private String userCountry;
	private String userMobile;
	private String userAddress;
	private String userUserName;
	private String userPassword;
	private String userEmail;

//	 @OneToMany(mappedBy = "user", cascade=CascadeType.ALL)
//	 private List<Payment> payments;
//	 

	 @OneToMany(mappedBy = "user", cascade= CascadeType.ALL)
	 private List<Booking> bookings;
	 
	 
	 
	 @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	 private Payment payment;
}
