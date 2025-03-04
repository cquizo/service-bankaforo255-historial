package com.app.aforo255.historial.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.aforo255.historial.model.entity.Transaction;

@Repository
public interface TransactionRepository extends MongoRepository<Transaction, String> {

	@Query("{'accountId': ?0}")
	Iterable<Transaction> findByAccountId(Integer accountId);
	
}
