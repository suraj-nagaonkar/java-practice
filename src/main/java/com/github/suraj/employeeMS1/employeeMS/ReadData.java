package com.github.suraj.employeeMS1.employeeMS;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.LinkedList;
/**
 * @author 11-03-2022
 */

public class ReadData {
    public LinkedList<Employee> readData(){
        LinkedList<Employee> A = new LinkedList<Employee>();

        try {
            FileReader myobj = new FileReader("E:\\Suraj\\File Handling\\Newfile.txt");
            Scanner myreader = new Scanner(myobj);
            System.out.println("Reading data from the file");
            while(myreader.hasNextLine()){
                try {
                    Thread.sleep(3000);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                  String data = myreader.nextLine();
                String[] Arr = data.split(",");
                int a = Arr.length;
                for(int i=0; i<a;i++){
                    System.out.print(Arr[i]+",");
                }
                String name = Arr[0];
                int id = Integer.parseInt(Arr[1]);
                int age= Integer.parseInt(Arr[2]);
                String bloodgroup = Arr[3];
                int salary = Integer.parseInt(Arr[4]);
                int experience = Integer.parseInt(Arr[5]);
                String maritalStatus = Arr[6];
                // Creating the object of employee class and passing the above parameters in the constructor
                Employee ExistingDetails = new Employee(name, id, age, bloodgroup, salary, experience, maritalStatus);
                A.add(ExistingDetails);
            }
            myreader.close();
            System.out.println("File closed after printing");
        }
        catch (FileNotFoundException e) {
            System.out.println("Error occured");
            e.printStackTrace();
        }
        return A; // A passing it's referece to the LinkedList class variable "B" declared in the main function//
    }
}
