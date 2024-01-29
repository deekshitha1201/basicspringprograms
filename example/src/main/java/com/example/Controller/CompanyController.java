package com.example.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Company;
import com.example.Service.CompanyService;

@RestController
public class CompanyController {
	@Autowired
	private CompanyService as;
	@PostMapping("/add")
	public ResponseEntity<String> addrec(@RequestBody Company company)
	{
		String res=as.add(company);
		return new ResponseEntity<String>(res,HttpStatus.CREATED);
	}
	@GetMapping("/alldata")
	public ResponseEntity<List<Company>> retrive() {
		List<Company> e=as.getall();
		return new ResponseEntity<List<Company>>(e,HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Company> findid(@PathVariable int id)
	{
		Optional<Company> c=as.find(id);
		return new ResponseEntity<Company>(HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteid(@PathVariable int id)
	{
		String rel=as.delete(id);
		return new ResponseEntity<String>(rel,HttpStatus.OK);
	}
	@PutMapping("/update")
	public ResponseEntity<Company> update(@PathVariable int id)
	{
		Company s=as.upset(id);
		return new ResponseEntity<Company>(s,HttpStatus.OK);
		
	}

}
