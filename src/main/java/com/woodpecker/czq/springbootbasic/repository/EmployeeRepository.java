package com.woodpecker.czq.springbootbasic.repository;

import com.woodpecker.czq.springbootbasic.model.Employee;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: woodpecker
 * @Date: 2019/6/28 17:33
 */
public class EmployeeRepository {
    private static List<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee(0, "小明", 20, "男"));
        employees.add(new Employee(1, "小红", 20, "男"));
        employees.add(new Employee(2, "小智", 20, "男"));
        employees.add(new Employee(3, "小刚", 20, "男"));
        employees.add(new Employee(4, "小霞", 20, "男"));
    }

    public static List<Employee> selectEmployees() {
        return employees;
    }

    public static boolean addEmployee(Employee employee) {
        if (checkEmployee(employee)) {
            employees.add(employee);
            return true;
        }
        return false;
    }

    private static boolean checkEmployee(Employee employee) {
        return employee != null
                && employee.getId() != null
                && !StringUtils.isEmpty(employee.getName())
                && employee.getAge() != null
                && !StringUtils.isEmpty(employee.getGender());
    }
}
