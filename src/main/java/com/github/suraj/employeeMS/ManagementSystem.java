package com.github.suraj.employeeMS;
import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author 11-03-2022
 */

public class ManagementSystem {
    public static void main(String[] args) {
        System.out.println("Do you want to add the new employees in the record");
        System.out.println("Expecting your response as Yes or No");
        EmployeeDetails Details = new EmployeeDetails();
        LinkedList<Employee> A = new LinkedList<Employee>();
        Scanner sc = new Scanner(System.in);
        String response = sc.next();
        if (response.compareTo("Yes") == 0) {
            System.out.println("How many records do want to update");
            int count = sc.nextInt();
            for(int i=1; i<=count;i++) {
                A.add(Details.employeeData());
            }
        }

        else{
            System.out.println("No records updated");
        }

        System.out.println("Would you like to print the name of employees from the records");
        System.out.println("Expecting your response as Yes or No");
        String response2 = sc.next();

        if (response2.compareTo("Yes")==0){
            System.out.println("Printing the records");
            for(int i = 0; i<A.size();i++){
                System.out.println(A.get(i).getName());
            }
        }

        else{
            System.out.println("You have selected the response as NO so not printing the name from the records");
        }

        System.out.println("Writing data to the file");

        try {
            FileWriter mywriter = new FileWriter("E:\\Suraj\\File Handling\\Newfile.txt");

                for(int i = 0; i<A.size();i++) {

                mywriter.write("\n"+"Employee name - "+ A.get(i).getName()+ "\n"+"ID - "+A.get(i).getId()+"\n"+"Age - " + A.get(i).getAge()+"\n"+"Marital Status - "+A.get(i).getMaritalstatus()+"\n"+"Blood group - "+A.get(i).getBloodgorup()+"\n"+"Experience in yrs - "+A.get(i).getExperience()+"\n"+"Salary in Rs. - "+A.get(i).getSalary());
                }
                mywriter.close();
            System.out.println("Succesfully wrote to the file");
        }catch(IOException e){
            System.out.println("Error resolved");
            e.printStackTrace();
        }
    }
}

