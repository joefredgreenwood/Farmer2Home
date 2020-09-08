package com.mastek.farmToShop.dao;

import org.springframework.data.repository.CrudRepository;

import com.mastek.farmToShop.entities.Transaction;

public interface TransactionDAO extends CrudRepository<Transaction, Integer>{

}
