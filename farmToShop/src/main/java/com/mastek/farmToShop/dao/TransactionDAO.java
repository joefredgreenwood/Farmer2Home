package com.mastek.farmToShop.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mastek.farmToShop.entities.Transaction;


@Repository
public interface TransactionDAO extends CrudRepository<Transaction, Integer>{

}
