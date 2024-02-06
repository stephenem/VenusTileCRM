package com.venusCRM.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venusCRM.entities.Sale;

public interface SaleDAO extends JpaRepository<Sale,Integer> {

}