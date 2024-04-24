package com.jasperImp.com.jasperDemo.repository;/*
 * @author -Suraj Tiwari
 */

import com.jasperImp.com.jasperDemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
