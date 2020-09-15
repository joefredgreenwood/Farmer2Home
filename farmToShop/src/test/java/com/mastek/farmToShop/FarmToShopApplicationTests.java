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
import com.mastek.farmToShop.entities.Basket;
import com.mastek.farmToShop.entities.Customer;
import com.mastek.farmToShop.entities.Product;
import com.mastek.farmToShop.entities.Transaction;

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
	
	
/*	@Test
	void addProductTest() {
		
		Product prod = new Product();
		prod.setProductName("Potato");
		prod.setProductPrice(2.50);
		prod.setProductQuantity(100);
		
		prod = prodDAO.save(prod);
		System.out.println(prod);
		
		
	}
*/
/*	@Test
	void addBasketTest(){
		
		Basket bas = new Basket();
		bas.setBasketValue(12.5);
		
		bas = BasDAO.save(bas);
		System.out.println(bas);
		
	}
*/
	
/*	@Test
	void addCustomerTest() {
		
		Customer cus = new Customer();
		cus.setCustomerForename("James");
		cus.setCustomerSurname("Bond");
		cus.setCustomerAddress("123 London Road, Leeds LS1 2PB");
		cus.setCustomerDOB("05/02/1990");
		cus.setCustomerEmail("james_bond@gmail.com");
		cus.setCustomerUsername("bond_mi6");
		cus.setCustomerPassword("imaspy12");
		
		cus = CusDAO.save(cus);
		System.out.println(cus);
		
	}
*/
	
/*	@Test
	void addTransactionTest() {
		
		Transaction tran = new Transaction();
		tran.setTransactionDate("01/09/2020");
		tran.setTransactionValue(12.5);
		
		tran = TranDAO.save(tran);
		System.out.println(tran);
	}
*/	
}

