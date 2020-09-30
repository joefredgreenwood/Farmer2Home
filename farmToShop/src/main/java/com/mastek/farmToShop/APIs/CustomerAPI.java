package com.mastek.farmToShop.APIs;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mastek.farmToShop.entities.Customer;



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
	
}



