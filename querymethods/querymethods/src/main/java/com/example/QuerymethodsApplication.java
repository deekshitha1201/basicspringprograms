package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Entity.Amazon;
import com.example.Repository.Amazonrepositry;

@SpringBootApplication
public class QuerymethodsApplication implements CommandLineRunner {
	@Autowired
	private Amazonrepositry amzrepo;

	public static void main(String[] args) {
		SpringApplication.run(QuerymethodsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Amazon a=new Amazon();
		a.setId(1);
		a.setName("product1");
		a.setPrice(500);
		Amazon a1=new Amazon();
		a1.setId(2);
		a1.setName("product2");
		a1.setPrice(2000);
		Amazon a2=new Amazon();
		a2.setId(3);
		a2.setName("product3");
		a2.setPrice(1000);
		amzrepo.saveAll(List.of(a,a1,a2));
		List<Amazon> pri=amzrepo.findDistinctByPrice(new Integer(500));
		pri.forEach((p)->
		System.out.println(p));
		
	}

}
