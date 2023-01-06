package com.example.schedulerProject.repository;

import com.example.schedulerProject.Entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {

}
