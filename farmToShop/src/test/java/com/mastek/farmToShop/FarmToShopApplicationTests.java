package com.mastek.farmToShop;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mastek.farmToShop.dao.AssignedProductDAO;
import com.mastek.farmToShop.dao.BasketDAO;
import com.mastek.farmToShop.dao.CustomerDAO;
import com.mastek.farmToShop.dao.FarmDAO;
import com.mastek.farmToShop.dao.ProductDAO;
import com.mastek.farmToShop.dao.TransactionDAO;
import com.mastek.farmToShop.entities.AssignedProduct;
import com.mastek.farmToShop.entities.Farm;
import com.mastek.farmToShop.entities.FarmLocation;
import com.mastek.farmToShop.entities.FarmType;
import com.mastek.farmToShop.entities.Product;
import com.mastek.farmToShop.services.JoinServices;


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
	
	@Autowired
	JoinServices joinS;
	
	
	@Test
	void addProduct() {
		
		Product prod = new Product();
		prod.setProductName("Potato");
		prod.setProductPrice(2.50);
		prod.setProductQuantity(100);
		
		prod = prodDAO.save(prod);
		assertNotNull(prod, "Work pls");;
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
	
	@Test
	void addFarm() {
		Farm farm = new Farm();
		farm.setFarmLocation(FarmLocation.SCOTLAND);
		farm.setFarmUsername("Farm1");
		farm.setFarmName("Mastek");
		farm.setFarmPassword("Password");
		farm.setFarmType(FarmType.TYPES);
		
		farm = FarDAO.save(farm);
		System.out.println(farm);
		
	}
	
	@Test
	void addAssignedProduct() {
		AssignedProduct aprod = new AssignedProduct();
		aprod.setProductQuantity(20);
		
		aprod = AsspDAO.save(aprod);
		System.out.println(aprod);
	}
	
	////////////////////////////////////////////////Joins////////////////////////////////////////////////
//	@Test
//	void assignProductToFarm() {
//		joinS.assignProductToFarm(5, 1);
//		
//	}
	
//	@Test
//	void findProductByFarm() {
//		Iterable<Product> prods = prodDAO.findByFarmID(5);
//		for (Product product : prods) {
//			System.out.println(product);
//		}
//			
//		
//	}
	
}
