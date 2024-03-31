package com.example.JwtAuthentication.Service;

import com.example.JwtAuthentication.Model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {

    List<Employee> employeeList = new ArrayList<>();
    public EmployeeService(){
        employeeList.add(new Employee(UUID.randomUUID().toString(),"rajesh","rajesh@123"));
        employeeList.add(new Employee(UUID.randomUUID().toString(),"raj","raj@123"));
        employeeList.add(new Employee(UUID.randomUUID().toString(),"nitin","nitin@123"));
    }
    public List<Employee> getEmployeeList(){
        return employeeList;
    }
}
