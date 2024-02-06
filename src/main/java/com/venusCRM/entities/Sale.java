package com.venusCRM.entities;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "vtmstab")
public class Sale {
	@Id
	@Column(name = "saleId")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer saleId;
	
	@OneToOne()
	@JoinColumn(name = "custId")
	private Customer custId;
	
	//@DateTimeFormat(iso= ISO.DATE)
	//@Temporal(TemporalType.DATE)
	@Column(name = "dos")
	private  Date dateOfSale;
	
	@Column(name = "price")
	private double price;
	
	@Column( name = "tonnage")
	private double tonnage;
	
	@Column(name = "size")
	private String size;

	public Integer getSaleId() {
		return saleId;
	}

	public void setSaleId(Integer saleId) {
		this.saleId = saleId;
	}

	public Customer getCustId() {
		return custId;
	}

	public void setCustId(Customer custId) {
		this.custId = custId;
	}

	public Date getDateOfSale() {
		return dateOfSale;
	}

	public void setDateOfSale(Date dateOfSale) {
		this.dateOfSale = dateOfSale;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTonnage() {
		return tonnage;
	}

	public void setTonnage(double tonnage) {
		this.tonnage = tonnage;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
}
