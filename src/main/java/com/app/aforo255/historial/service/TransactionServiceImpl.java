package com.app.aforo255.historial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.aforo255.historial.model.entity.Transaction;
import com.app.aforo255.historial.model.repository.TransactionRepository;

@Service
public class TransactionServiceImpl implements ITransactionService {

	@Autowired
	private TransactionRepository repository;
	
	@Override
	public Transaction save(Transaction transaction) {
		return repository.save(transaction);
	}

	@Override
	public Iterable<Transaction> findByAccountId(Integer accountId) {
		return repository.findByAccountId(accountId);
	}

	@Override
	public Iterable<Transaction> findAll() {
		return repository.findAll();
	}
}
