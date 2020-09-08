package com.mastek.farmToShop.dao;

import org.springframework.data.repository.CrudRepository;

import com.mastek.farmToShop.entities.Product;

public interface ProductDAO extends CrudRepository<Product, Integer>{

}
