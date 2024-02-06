package com.venusCRM.DAO;

import java.util.List;

import com.venusCRM.entities.Customer;
import com.venusCRM.entities.Sale;

public interface CustomerInterfaceDAO {
	void register(Customer cust);
	List<Customer> getAllCust();
	void deleteCustomerById(Integer id);
	void deleteSaleById(Integer id);
	Customer getCustById(Integer id);
	void updateCust(Customer cust);
	void updateSale(Sale sale);
	Sale getSaleById(Integer id);
	List<Sale> getAllSales();
	
}
