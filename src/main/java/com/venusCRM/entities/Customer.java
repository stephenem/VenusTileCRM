package com.venusCRM.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "vtmtab")
public class Customer {
	
	@Id
	@Column(name = "custId")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer custId;
	
	@Column(name = "fname")
	private String firstName;
	
	@Column(name = "lname")
	private String lastName;
	
	@Column(name = "phone")
	private String phoneNum;
	
	@Column(name = "address")
	private String address;
	
	@Override
	public String toString() {
		return (this.firstName + " " + this.lastName);
	}

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
