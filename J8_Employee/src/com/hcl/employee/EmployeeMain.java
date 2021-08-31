package com.hcl.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {
    final static double INCREMENT_SALARY = 10000;

    public static void main(String[] args) {
        List<Employees> employeeslist = new ArrayList<Employees>();
        employeeslist.add(new Employees(1, "Aswini", 22000, "Software engineer", 23, "9653486248"));
        employeeslist.add(new Employees(2, "Tummala Aswini", 60000, "Testing", 21, "8633486248"));
        employeeslist.add(new Employees(3, "Narasimhulu", 4000, "Sr.Software engineer", 26, "7543486248"));
        employeeslist.add(new Employees(4, "Viswanath Reddy", 18000, "engineer", 15, "6353486248"));
        System.out.println(employeeslist);

        System.out.println("Age greater than 18");

        List<Employees> tempList = employeeslist.stream().filter(e -> e.getAge() > 18).collect(Collectors.toList());
        System.out.println(tempList);

        System.out.println("Salary greater than 50000");
        List<Employees> employeesSalary = employeeslist.stream().filter(e -> e.getSalary() > 50000).map(e -> e)
                .collect(Collectors.toList());

        System.out.println(employeesSalary);

        System.out.println("Salary less than 20000");
        List<Employees> employeesSalarys = employeeslist.stream().filter(e -> e.getSalary() < 20000).map(e -> e)
                .collect(Collectors.toList());

        System.out.println(employeesSalarys);

        System.out.println("Salary is incremented");
        List<Employees> newEployees = employeeslist.stream().map(e -> {
            e.setSalary(e.getSalary() + INCREMENT_SALARY);
            return e;
        }).collect(Collectors.toList());

        System.out.println(newEployees);

    }

}
