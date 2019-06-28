package com.woodpecker.czq.springbootbasic.controller;

import com.woodpecker.czq.springbootbasic.model.Employee;
import com.woodpecker.czq.springbootbasic.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: woodpecker
 * @Date: 2019/6/28 17:31
 */
@RestController
public class EmployeeController {

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return EmployeeRepository.selectEmployees();
    }
}
