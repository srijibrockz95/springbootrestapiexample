package com.letsstartcoding.springbootrestapiexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.letsstartcoding.springbootrestapiexample.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
