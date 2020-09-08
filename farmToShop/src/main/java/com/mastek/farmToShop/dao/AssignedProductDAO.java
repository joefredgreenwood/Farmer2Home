package com.mastek.farmToShop.dao;

import org.springframework.data.repository.CrudRepository;

import com.mastek.farmToShop.entities.AssignedProduct;

public interface AssignedProductDAO extends CrudRepository<AssignedProduct, Integer> {

}
