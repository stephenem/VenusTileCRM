package com.venusCRM.controllers;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.venusCRM.DAO.CustomerDAO;
import com.venusCRM.entities.Customer;

import com.venusCRM.entities.Sale;
import com.venusCRM.services.CustomerDAOImplement;

@Controller
//@RequestMapping("/")
public class PageController {
	@Autowired
	private CustomerDAOImplement dao;
	@Autowired
	private CustomerDAO d;
	
	@GetMapping("/")
	public String home() {
		return "Home";
	}
	@PostMapping("/register")
	public String register(@ModelAttribute Customer cust) {
		dao.register(cust);
		return "redirect:show";
	}
	@PostMapping("/registerSales")
	public String registerSales(@ModelAttribute Sale sale) {
		dao.registerSale(sale);
		return "redirect:show";
	}
	@GetMapping("/add")
	public String add() {
		return "Add";
	}
	@GetMapping("/customers")
	public String customers() {
		return "redirect:show";
	}
	@GetMapping("/addSale")
	public String addSale(@RequestParam Integer id,Model model) {
		Customer cust = dao.getCustById(id);
		model.addAttribute("cust",cust);
		return "AddSale";
	}
	@GetMapping("/show")
	public String showAll(Model model) {
		List<Customer> list = dao.getAllCust();
		
		model.addAttribute("list", list);
		return "Customers";
	}
	@GetMapping ("/delete")
	public String removeCustomer(@RequestParam Integer id) {
		dao.deleteCustomerById(id);
		return "redirect:show";
	}
	@GetMapping ("/deleteSale")
	public String removeSale(@RequestParam Integer id) {
		dao.deleteSaleById(id);
		return "redirect:showSales";
	}
	
	@GetMapping ("/edit")
	public String getEdit(@RequestParam Integer id,Model model) {
		Customer cust = dao.getCustById(id);
		model.addAttribute("cust",cust);
		return "CustEdit";
	}
	@PostMapping("/update")
	public String updateCustomer(@ModelAttribute Customer cust){
		dao.updateCust(cust);
		return "redirect:show";
		
	}
	@GetMapping ("/editSale")
	public String getEditSale(@RequestParam Integer id,Model model) {
		Sale sale = dao.getSaleById(id);
		model.addAttribute("sale",sale);
		return "SaleEdit";
	}
	@PostMapping("/updateSale")
	public String updateSale(@ModelAttribute Sale sale){
		dao.updateSale(sale);
		return "redirect:showSales";
		
	}
	@GetMapping("/showSales")
	public String showSales(Model saleModel) {
		List<Sale> list = dao.getAllSales();
		saleModel.addAttribute("list", list);
		return "ShowSales";
	}
	
	
}
