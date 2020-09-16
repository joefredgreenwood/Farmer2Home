package com.mastek.farmToShop.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.mastek.farmToShop.dao.AssignedProductDAO;
import com.mastek.farmToShop.dao.BasketDAO;
import com.mastek.farmToShop.dao.CustomerDAO;
import com.mastek.farmToShop.dao.FarmDAO;
import com.mastek.farmToShop.dao.ProductDAO;
import com.mastek.farmToShop.dao.TransactionDAO;
import com.mastek.farmToShop.entities.Farm;
import com.mastek.farmToShop.entities.Product;

public class joinServices {
	
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
	
	
	

}
