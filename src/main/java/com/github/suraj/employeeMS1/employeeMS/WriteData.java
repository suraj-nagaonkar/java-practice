package com.github.suraj.employeeMS1.employeeMS;

import com.github.suraj.employeeMS.Employee;
import com.github.suraj.employeeMS.EmployeeDetails;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author 12-03-2022
 */

public class WriteData {
    public void writeData(LinkedList B){
        System.out.println("Do you want to add the new employees in the record");
        System.out.println("Expecting your response as Yes or No");
        LinkedList<Employee> C = B;
        EmployeeDetails Details = new EmployeeDetails();
        Scanner sc = new Scanner(System.in);
        String response = sc.next();
        if (response.compareTo("Yes") == 0) {
            System.out.println("How many records do want to update");
            int count = sc.nextInt();
            for(int i=1; i<=count;i++) {
                B.add(Details.employeeData());
            }
        }

        else{
            System.out.println("No records updated");
        }


        System.out.println("Writing data to the file");

        try {
            FileWriter mywriter = new FileWriter("E:\\Suraj\\File Handling\\Newfile.txt");

            for(int i = 0; i<B.size();i++) {
                mywriter.write(C.get(i).getName()+","+C.get(i).getId()+"," + C.get(i).getAge()+","+C.get(i).getBloodgorup()+","+C.get(i).getSalary()+","+C.get(i).getExperience()+","+C.get(i).getMaritalstatus()+"\n");
            }
            mywriter.close();
            System.out.println("Succesfully wrote to the file");
        }catch(IOException e){
            System.out.println("Error resolved");
            e.printStackTrace();
        }
    }

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
