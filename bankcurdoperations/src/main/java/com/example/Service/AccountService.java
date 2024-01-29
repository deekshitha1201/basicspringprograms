package com.example.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.Entity.Account;

@Service
public interface AccountService {
	Account create(Account account);
	Optional<Account> getAccount(Long id);
	public Account deposit(Long id,Double balance);
	public Account withdraw(Long id,Double balance);

}
