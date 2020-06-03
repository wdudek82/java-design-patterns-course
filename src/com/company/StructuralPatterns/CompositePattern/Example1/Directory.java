package com.company.StructuralPatterns.CompositePattern.Example1;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Employee {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public void showEmployeeDetails() {
        for (Employee employee : employees) {
            employee.showEmployeeDetails();
        }
    }
}
