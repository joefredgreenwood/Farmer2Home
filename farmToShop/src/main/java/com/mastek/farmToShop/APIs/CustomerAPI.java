package com.mastek.farmToShop.APIs;

import java.util.Set;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mastek.farmToShop.entities.AssignedProduct;
import com.mastek.farmToShop.entities.Basket;
import com.mastek.farmToShop.entities.Customer;
import com.mastek.farmToShop.entities.Product;



@Path("/farmtoshop/")
public interface CustomerAPI {
	
	
	//http://localhost:7777/farmtoshop/customer/list

	@GET
	@Path("/customer/list")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Iterable<Customer> listAllCustomers();
	
	@GET
	@Path("/customer/find/{customerID}")
	@Produces({MediaType.APPLICATION_JSON})
	public Customer findByCustomerid(@PathParam("customerID") int customerID);
	
	
	@POST
	@Path("/customer/register")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces({MediaType.APPLICATION_JSON})
	public Customer registerNewCustomer(@BeanParam Customer newCustomer);
	
	
	@GET
	@Path("/customer/findu/{username}/{password}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Customer findByUsernameAndPassword(@PathParam("username") String username, @PathParam("password") String password);
	
	@DELETE
	@Path("/customer/delete/{customerID}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Customer deleteCustomer(@PathParam("customerID") int customerID);
	
	@GET
	@Path("/customer/basket/findu/{username}/{password}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Basket findBasketByUsernameAndPassword(@PathParam("username") String username, @PathParam("password") String password);
	
	
	@POST
	@Path("/customer/product/buy")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces({MediaType.APPLICATION_JSON})
	public AssignedProduct buySomething(@FormParam("productQuantity") int aProdQuantity,
			@FormParam("productID") int productID, @FormParam("customerID") int customerID);
	
	@POST
	@Path("/customer/product/show")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces({MediaType.APPLICATION_JSON})
	public Set<AssignedProduct> showProducts(@FormParam("basketID") int basketID);
	
	@POST
	@Path("/customer/product/ashow")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces({MediaType.APPLICATION_JSON})
	public Product showProds(@FormParam("assignedProductID") int assignedProductID);
	
	
	
	
	
	
	
}



