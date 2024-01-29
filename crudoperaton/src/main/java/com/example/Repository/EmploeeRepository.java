package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Employee;

public interface EmploeeRepository extends JpaRepository<Employee, Integer> {

}
