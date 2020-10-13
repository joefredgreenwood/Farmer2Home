package com.mastek.farmToShop.APIs;

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


@Path("/farmtoshop/")
public interface BasketAPI {

	
	//http://localhost:7777/farmtoshop/basket/list

		@GET				 // http Method: GET to recieve data in requests
		@Path("/basket/list")// URL path to access this basket List
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
		
		// http://localhost:7777/farmtoshop/basket/delete
		@DELETE
		@Path("/basket/delete/{basketID}")
		@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
		public Basket deleteBasket(@PathParam("basketID") int basketID);
		
		/*@DELETE
		@Path("/basket/product/delete/{basketID}/{produtID}")
		@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
		@Produces({MediaType.APPLICATION_JSON})
		public DeleteProduct  removeProductFromBasket(@BeanParam RemoveProduct aProd,
				@PathParam("basketID") int basketID, @PathParam("productID") int productID);
*/
		
		@POST 															 // HTTP method Post used to send data in requests
		@Path("/basket/update/{basketID}")								 // URL path to access this method
		@Consumes(MediaType.APPLICATION_FORM_URLENCODED)				 // The @Consumes annotation is used to specify which MIME media types of representations a resource can accept, or consume, from the client.
		@Produces(MediaType.APPLICATION_JSON)							 // The @Produces annotation is used to specify the MIME media types or representations a resource can produce and send back to the client. 
		public Basket updateBasket(
				@FormParam("basketID") int basketID,
				@FormParam("basketValue")double basketValue);
}
