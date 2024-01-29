package com.example.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.Entity.Company;

@Service
public interface CompanyService {
	String add(Company company);
	List<Company> getall();
	Optional<Company> find(int id);
	String delete(int id);
	Company upset(int id);

}
