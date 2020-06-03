package com.company.StructuralPatterns.CompositePattern.Example2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Manager implements Employee {
    private final List<Employee> employees = new ArrayList<>();

    private final String name;
    private final double salary;

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Employee getChild(int i) {
        return employees.get(i);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("-".repeat(40));
        System.out.println("Name = " + getName());
        System.out.println("Salary = " + getSalary());
        System.out.println("-".repeat(40));

        Iterator<Employee> employeeIterator = employees.iterator();
        while (employeeIterator.hasNext()) {
            Employee employee = employeeIterator.next();
            employee.showEmployeeDetails();
        }
    }
}
