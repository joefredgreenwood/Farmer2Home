package com.mastek.farmToShop.APIs;

import java.util.Set;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mastek.farmToShop.entities.Customer;
import com.mastek.farmToShop.entities.Farm;
import com.mastek.farmToShop.entities.FarmLocation;
import com.mastek.farmToShop.entities.Product;

@Path("/farmtoshop/")
public interface FarmAPI {
	
	//http://localhost:7777/farmtoshop/farm/list
	@GET
	@Path("/farm/list")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Iterable<Farm> listAllFarms();
	
	@GET
	@Path("/farm/find/{farmID}")
	@Produces({MediaType.APPLICATION_JSON})
	public Farm findByFarmid(@PathParam("farmID") int farmID);
	
	
	@POST
	@Path("/farm/register")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces({MediaType.APPLICATION_JSON})
	public Farm registerNewFarm(@BeanParam Farm newFarm);
	
	@GET
	@Path("/farm/location/{farmLocation}")
	@Produces({MediaType.APPLICATION_JSON})
	public Iterable<Farm> findByFarmLocation(@PathParam("farmLocation") FarmLocation farmLocation);
	
	@GET
	@Path("/farm/findu/{username}/{password}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Farm findByFarmUsernameAndPassword(@PathParam("username") String username, @PathParam("password") String password);
	
	@GET
	@Path("/farm/product/findu/{username}/{password}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Iterable<Product> findProductByFarUsernameAndPassword(@PathParam("username") String username, @PathParam("password") String password);
	
	@POST
	@Path("/farm/product/register")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces({MediaType.APPLICATION_JSON})
	public Product registerNewFarmProducts(@BeanParam Product product,
			@FormParam("username") String username, @FormParam("password") String password);
	

	@GET
	@Path("/farm/product/findP/{farmID}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Set<Product> findProducstByFarmID(@PathParam("farmID") int farmID);
	
}
		/*
		//http://localhost:7777/farmtoshop/farm/update
		@POST 														
		@Path("/farm/update/{farmID}")									 
		@Consumes(MediaType.APPLICATION_FORM_URLENCODED)				 
		@Produces(MediaType.APPLICATION_JSON)							 
		public Customer updateFarm(
				@FormParam("farmID") int farmID,
				@FormParam("farmName") String farmName,
				@FormParam("farmLocation")String farmLocation,
				@FormParam("farmType") String farmType,
				@FormParam("farmUsername") String farmUsername,
				@FormParam("farmPassword") String farmPassword);
		}
		*/
