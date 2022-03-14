package com.github.suraj.employeemanagementsystem;

import java.io.*;
import java.util.Scanner;

/**
 * @author 10-03-2022
 */

 class EmployeeFileCreation {
    public static void employeeDetails(){
        File Employee = new File("E:\\Suraj\\Employee management system\\Employee1.txt");
        try {
            if(Employee.createNewFile()){
                System.out.println("Document for the respective employee created");
            }else{
                System.out.println("Employee record already exist");
            }
        }
        catch (IOException e) {
            System.out.println("Error automatically solved");
            e.printStackTrace();
        }

        try {
            FileWriter Writer = new FileWriter("E:\\Suraj\\Employee management system\\Employee1.txt");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name - ");
            String Name = sc.nextLine();
            System.out.println("Enter your employee id - ");
            String EmployeeId = sc.nextLine();
            System.out.println("Enter your age - ");
            int age = sc.nextInt();
            System.out.println("Enter your marital status - ");
            String MaritalStatus = sc.nextLine();
            System.out.println("Enter your blood group - ");
            String BloodGroup = sc.nextLine();
            System.out.println("Enter your salary - ");
            int salary = sc.nextInt();
            Writer.write("\n1. Employee Name - "+ Name +"\n\n2. Employee id - "+ EmployeeId+"\n\n3. Age - "+ age+"\n\n4. Marital Status - "+ MaritalStatus+"\n\n5. Blood group - "+BloodGroup+"\n\n6. Salary - "+salary);
            System.out.println("Employee details updated and closing the file");
            Writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String fileRead(){
        String data = null;
        try {
            FileReader myobj = new FileReader("E:\\Suraj\\Employee management system\\Employee1.txt");
            Scanner myreader = new Scanner(myobj);
            while(myreader.hasNextLine()){
                data = myreader.nextLine();
                if (data.compareTo("") == 0){
                    System.out.println("No data found in the file");
                }
                else{
                    System.out.println("Data exist");
                }
            }
            myreader.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return data;
    }
}
