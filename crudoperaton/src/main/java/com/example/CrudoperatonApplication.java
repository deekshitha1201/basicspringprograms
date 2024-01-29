package com.example;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Entity.Employee;
import com.example.Repository.EmploeeRepository;

@SpringBootApplication
public class CrudoperatonApplication implements CommandLineRunner {
	@Autowired
	private EmploeeRepository empRepository;

	public static void main(String[] args) {
		SpringApplication.run(CrudoperatonApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.setName("rajyalaxmi");
		emp.setAddress("kommavaram");
		empRepository.save(emp);
		Optional<Employee> e1=empRepository.findById(2);
		if(e1.isPresent()) {
			Employee e2=e1.get();
			e2.setAddress("hyderabad");
			empRepository.save(e2);
		}
				System.out.println(e1);
				
		empRepository.deleteById(4);
	}

}
