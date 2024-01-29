package com.example.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Account;
import com.example.Repository.AccountRepository;

@Service
public class Accountimp implements AccountService {
	@Autowired
	private AccountRepository ar;
	private Double amount;

	@Override
	public Account create(Account account) {
		// TODO Auto-generated method stub
		return ar.save(account);
	}

	@Override
	public Optional<Account> getAccount(Long id) {
		// TODO Auto-generated method stub
		return ar.findById(id);
	}

	@Override
	public Account deposit(Long id, Double balance) {
		Account acc=getAccount(id).orElseThrow(()->new RuntimeException("account not found"));
		acc.setBalance(acc.getBalance()+amount);
		return ar.save(acc);
	}

	@Override
	public Account withdraw(Long id, Double balance) {
		Account acc=getAccount(id).orElseThrow(()->new RuntimeException("account not found"));
		acc.setBalance(acc.getBalance()-amount);
		return ar.save(acc);
	}

}
