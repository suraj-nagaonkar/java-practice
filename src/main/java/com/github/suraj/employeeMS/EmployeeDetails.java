package com.github.suraj.employeeMS;

import java.util.Scanner;

/**
 * @author 11-03-2022
 */

public class EmployeeDetails {

    public Employee employeeData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter you ID");
        int id = sc.nextInt();
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Enter your blood group");
        String bloodgroup = sc.next();
        System.out.println("Enter your experience in yrs");
        int experience = sc.nextInt();
        System.out.println("Enter your salary");
        int salary = sc.nextInt();
        System.out.println("Enter your marital status");
        String marital = sc.next();
        Employee employee1 = new Employee(name, id, age, marital, bloodgroup, experience, salary);
        return employee1;
    }
}
