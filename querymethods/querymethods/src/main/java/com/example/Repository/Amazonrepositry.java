package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Amazon;

public interface Amazonrepositry extends JpaRepository<Amazon, Integer> {
	

	

List<Amazon> findDistinctByPrice(Integer price);
}
