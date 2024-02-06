package com.venusCRM.DAO;

import java.util.List;

import org.hibernate.mapping.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.venusCRM.entities.Customer;

import com.venusCRM.entities.Sale;

public interface CustomerDAO extends JpaRepository<Customer,Integer> {
	
}
