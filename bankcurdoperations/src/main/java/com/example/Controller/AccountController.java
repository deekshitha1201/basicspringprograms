package com.example.Controller;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Account;
import com.example.Service.Accountimp;

@RestController
public class AccountController {
	@Autowired
	private Accountimp as;
	@PostMapping("/account")
	public ResponseEntity<Account> createaccount(@RequestBody Account account)
	{
		return new ResponseEntity<Account>(as.create(account),HttpStatus.CREATED);
		
	}
	@GetMapping("{id}")
	public ResponseEntity<Optional<Account>> getAccount(@PathVariable Long id)
	{
		Optional<Account> a=as.getAccount(id);
		if(a.isPresent())
		{
			return new ResponseEntity<Optional<Account>>(a,HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<Optional<Account>>(HttpStatus.BAD_REQUEST);
		}
	}
	@GetMapping("/{id}/deposit")
	public Account deposit(@PathVariable Long id,@RequestBody Map<String,Double>request)
	{
		Double amount=request.get("amount");
		return as.deposit(id, amount);
	}
	@GetMapping("/{id}/withdraw")
	public Account withdraw(@PathVariable Long id,@RequestBody Map<String,Double>request)
	{
		Double amount=request.get("amount");
		return as.withdraw(id, amount);
	}

}
