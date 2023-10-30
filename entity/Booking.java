package com.example.roombooking.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="booking_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Booking {

	@Id  // Primary key
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bookingId;
	private LocalDate bookingDate;
	private int bookingDays;
	private int bookingPersons;
	private String bookingDesc;

	
	 @ManyToOne
	 @JoinColumn(name = "userId")
	 private User user;
}
