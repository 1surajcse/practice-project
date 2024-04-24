package com.jasperImp.com.jasperDemo.service;
/*
 * @author -Suraj Tiwari
 */
import com.jasperImp.com.jasperDemo.entity.Employee;
import com.jasperImp.com.jasperDemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private  EmployeeRepository employeeRepository;

    public Employee save(Employee employee) {
        return  employeeRepository.save(employee);
    }
}
