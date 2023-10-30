package com.example.roombooking.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="payment_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

	@Id  // Primary key
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int paymentId;
	private int paymentAmount;
	private String paymentAddress;
	private String paymentDesc;

	
//	 @ManyToOne
//	 @JoinColumn(name = "userId")
//	 private User user;
	
	
	
	
	 @OneToOne
	    @JoinColumn(name = "userId")
	    private User user;
}
