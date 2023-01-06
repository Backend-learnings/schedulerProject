package com.example.schedulerProject.service.impl;


import com.example.schedulerProject.Entity.Employee;
import com.example.schedulerProject.repository.EmployeeRepository;
import com.example.schedulerProject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

  @Autowired
  EmployeeRepository employeeRepository;


  @Override
  public Employee addEmployee(Employee employee) {
    return employeeRepository.save(employee);
  }
}
