package com.mastek.farmToShop.APIs;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.mastek.farmToShop.services.farmShopServices;

@Component
public class APIConfig extends ResourceConfig {
			  
	public APIConfig() {
	register (farmShopServices.class);
	register (CORSFilter.class);
	}

}
