package com.mastek.farmToShop.dao;

import org.springframework.data.repository.CrudRepository;

import com.mastek.farmToShop.entities.Customer;

public interface CustomerDAO extends CrudRepository<Customer, Integer> {

}
