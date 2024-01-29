package com.example.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Company;
import com.example.Repository.CompanyRepository;

@Service
public class Companyimp implements CompanyService {
	@Autowired
	private CompanyRepository cs;

	public String add(Company company) {
		cs.save(company);
		return "successfully saved data";
	}

	public List<Company> getall() {
		// TODO Auto-generated method stub
		return cs.findAll();
	}

	
	public Optional<Company> find(int id) {
		// TODO Auto-generated method stub
		return cs.findById(id);
	}

	public String delete(int id) {
		// TODO Auto-generated method stub
		if(cs.existsById(id))
		{
			cs.deleteById(id);
			return "deleted";
		}
		return "not found";
		
	}

	public Company upset(int id) {
		// TODO Auto-generated method stub
		Companyimp cp=new Companyimp();
		Company k=cs.findById(id).get();
		k.setName("banglore");
		k.setCity("manglore");
		
		return cs.save(k);
	}

}
