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
@Table(name="permission_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Permission {

	
	@Id  // Primary key
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int permissionId;
	private String permissionStatus;
	
	
}
