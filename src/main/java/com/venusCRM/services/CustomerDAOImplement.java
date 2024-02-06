package com.venusCRM.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.venusCRM.DAO.CustomerDAO;
import com.venusCRM.DAO.CustomerInterfaceDAO;
import com.venusCRM.DAO.SaleDAO;
import com.venusCRM.DAO.SaleInterface;
import com.venusCRM.entities.Customer;
import com.venusCRM.entities.Sale;

@Service
public class CustomerDAOImplement implements CustomerInterfaceDAO,SaleInterface{
	@Autowired
	private CustomerDAO dao;
	@Autowired
	private SaleDAO saleDAO;
	
	@Override
	public void register(Customer cust) {
		dao.save(cust);
	}
	@Override
	public List<Customer> getAllCust() {
		return dao.findAll();
	}
	@Override
	public void deleteCustomerById(Integer id) {
		dao.deleteById(id);
		
	}
	@Override
	public Customer getCustById(Integer id) {
		Optional<Customer> opt = dao.findById(id);
		if(opt.isEmpty()) {
			return null;
		}
		return opt.get();
	}
	@Override
	public void updateCust(Customer cust) {
		dao.save(cust);
		
	}
	@Override
	public void registerSale(Sale sale) {
		saleDAO.save(sale);
		
	}
	@Override
	public List<Sale> getAllSales() {
		return saleDAO.findAll();
	}
	@Override
	public void deleteSaleById(Integer id) {
		saleDAO.deleteById(id);
		
	}
	@Override
	public void updateSale(Sale sale) {
		saleDAO.save(sale);
		
	}
	@Override
	public Sale getSaleById(Integer id) {
		Optional<Sale> opt = saleDAO.findById(id);
		if(opt.isEmpty()) {
			return null;
		}
		return opt.get();
	}
	
	
	
	
	
}
