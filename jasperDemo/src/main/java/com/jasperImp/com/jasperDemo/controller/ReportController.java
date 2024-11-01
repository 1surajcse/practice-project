package com.jasperImp.com.jasperDemo.controller;
/*
 * @author -Suraj Tiwari
 */

import com.jasperImp.com.jasperDemo.entity.Employee;
import com.jasperImp.com.jasperDemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class ReportController {

    @Autowired
    private EmployeeService employeeService;
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){

        return employeeService.save(employee);
    }
}
