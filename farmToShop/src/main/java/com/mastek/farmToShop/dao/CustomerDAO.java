package com.mastek.farmToShop.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mastek.farmToShop.entities.Customer;


@Repository
public interface CustomerDAO extends CrudRepository<Customer, Integer> {

}
