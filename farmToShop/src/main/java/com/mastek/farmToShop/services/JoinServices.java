package com.mastek.farmToShop.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mastek.farmToShop.dao.AssignedProductDAO;
import com.mastek.farmToShop.dao.BasketDAO;
import com.mastek.farmToShop.dao.CustomerDAO;
import com.mastek.farmToShop.dao.FarmDAO;
import com.mastek.farmToShop.dao.ProductDAO;
import com.mastek.farmToShop.dao.TransactionDAO;
import com.mastek.farmToShop.entities.AssignedProduct;
import com.mastek.farmToShop.entities.Basket;
import com.mastek.farmToShop.entities.Customer;
import com.mastek.farmToShop.entities.Farm;
import com.mastek.farmToShop.entities.Product;
import com.mastek.farmToShop.entities.Transaction;

@Component
public class JoinServices {
	
	@Autowired
	ProductDAO prodDAO;

	@Autowired
	AssignedProductDAO AsspDAO;
	
	@Autowired
	BasketDAO BasDAO;
	
	@Autowired
	CustomerDAO CusDAO;
	
	@Autowired
	FarmDAO FarDAO;
	
	@Autowired
	TransactionDAO TranDAO;
	
	@Transactional
	public Farm assignProductToFarm(int farmID, int productID) {
		Farm farm = FarDAO.findById(farmID).get();
		Product prod = prodDAO.findById(productID).get();
		
		farm.getFarmProduce().add(prod);
		FarDAO.save(farm);
		
		
		return farm;
	}
	
	@Transactional
	public AssignedProduct assigednProductToProduct(int assignedID, int productID) {
		AssignedProduct aprod = AsspDAO.findById(assignedID).get();
		Product prod = prodDAO.findById(productID).get();
		
		aprod.setCurrentProduct(prod);
		prod.getAssignedProducts().add(aprod);
		
		prodDAO.save(prod);
		AsspDAO.save(aprod);
		
		return aprod;
	}
	
	@Transactional
	public AssignedProduct assignedProductToBasket(int assignedID, int basketID) {
		AssignedProduct aprod = AsspDAO.findById(assignedID).get();
		Basket bask = BasDAO.findById(basketID).get();
		
		aprod.setCurrentBasket(bask);
		bask.getBasketProducts().add(aprod);
		
		AsspDAO.save(aprod);
		BasDAO.save(bask);
		
		
		return aprod;

	}
	
	@Transactional
	public Transaction linkTransactionToBasket(int tranID, int basketID) {
		Transaction tran = TranDAO.findById(tranID).get();
		Basket bask = BasDAO.findById(basketID).get();
		
		tran.setLinkedBasket(bask);
		TranDAO.save(tran);
		
		
		return tran;
	}
	
	
	@Transactional
	public Basket linkBasketToCustomer(int baskID, int custID) {
		Basket bask = BasDAO.findById(baskID).get();
		Customer cust = CusDAO.findById(custID).get();
		
		bask.setLinkedCustomer(cust);
		cust.getCustomersBaskets().add(bask);
		
		BasDAO.save(bask);
		CusDAO.save(cust);
		
		
		return bask;
	}
	
	

}
