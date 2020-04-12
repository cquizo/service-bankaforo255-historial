package com.app.aforo255.historial.service;

import com.app.aforo255.historial.model.entity.Transaction;

public interface ITransactionService {

	Transaction save(Transaction transaction);
	Iterable<Transaction> findByAccountId(Integer accountId);
	Iterable<Transaction> findAll();
}
