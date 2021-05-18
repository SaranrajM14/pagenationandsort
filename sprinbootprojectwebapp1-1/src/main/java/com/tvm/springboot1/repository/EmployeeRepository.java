package com.tvm.springboot1.repository;
import com.tvm.springboot1.model.Employee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	@Query("SELECT p FROM Employee p WHERE p.firstName LIKE %?1%")
	public List<Employee> findAll(String keyword);
}
