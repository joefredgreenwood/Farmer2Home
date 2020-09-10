package com.mastek.farmToShop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mastek.farmToShop.dao.AssignedProductDAO;
import com.mastek.farmToShop.dao.BasketDAO;
import com.mastek.farmToShop.dao.CustomerDAO;
import com.mastek.farmToShop.dao.FarmDAO;
import com.mastek.farmToShop.dao.ProductDAO;
import com.mastek.farmToShop.dao.TransactionDAO;
import com.mastek.farmToShop.entities.Product;

@SpringBootTest
class FarmToShopApplicationTests {
	
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
	
	
	@Test
	void addProductTest() {
		
		Product prod = new Product();
		prod.setProductName("Potato");
		prod.setProductPrice(2.50);
		prod.setProductQuantity(100);
		
		prod = prodDAO.save(prod);
		System.out.println(prod);
		
		
	}
	
	@Test
	void removeProductTest() {
		prodDAO.deleteById(1);
	}

	@Test
	void findProductByID() {
		Product prod = prodDAO.findById(1).get();
		System.out.println(prod);
	}
	
}
