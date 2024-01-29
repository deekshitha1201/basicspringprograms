package com.example.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String accountholdername;
	private Double balance;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(String accountholdername, Double balance) {
		super();
		this.accountholdername = accountholdername;
		this.balance = balance;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAccountholdername() {
		return accountholdername;
	}
	public void setAccountholdername(String accountholdername) {
		this.accountholdername = accountholdername;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
    
}
