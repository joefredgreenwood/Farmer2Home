package com.mastek.farmToShop.APIs;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mastek.farmToShop.entities.Basket;

@Path("/farmtoshop/")
public interface BasketAPI {

	
	//http://localhost:7777/farmtoshop/basket/list

		@GET
		@Path("/basket/list")
		@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
		public Iterable<Basket> listAllBaskets();

		// http://localhost:7777/farmtoshop/basket/find/
		@GET
		@Path("/basket/find/{basketID}")
		@Produces({MediaType.APPLICATION_JSON})
		public Basket findByBasketid(@PathParam("basketID") int basketID);

		// http://localhost:7777/farmtoshop/basket/register
		@POST
		@Path("/basket/register")
		@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
		@Produces({MediaType.APPLICATION_JSON})
		public Basket registerNewBasket(@BeanParam Basket newBasket);

}
