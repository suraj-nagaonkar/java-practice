package com.github.suraj.employeeMS1.employeeMS;

import java.util.LinkedList;

/**
 * @author 12-03-2022
 */

public class HR {
    public void exp(int s) {
        ReadData read = new ReadData();
        LinkedList<Employee> List = read.readData(); // Linked list returned by the readData function
        int Size = List.size();
        int z = 0;
        int TotalEmployee = 0;
        for (int i = 0; i < Size; i++) {
            z = List.get(i).getExperience();
            System.out.println(z);
            if(z > s){
                TotalEmployee++;
            }
            else {

            }
            System.out.println("Total employee above 1 year of experience - "+TotalEmployee);
        }
    }

    public void bloodgroup(){
        ReadData read = new ReadData();
        LinkedList<Employee> List = read.readData(); // Linked list returned by the readData function
        int d = List.size();
        int count = 0;
        for(int i = 0; i<d; i++){
            String blood = List.get(i).getBloodgroup();
            if(blood.compareTo("A+")==0){
                count++;
            }
            else{}
        }
        System.out.println("Total count of people with blood group as A+ - "+count);
    }

    public void married(){
        ReadData read = new ReadData();
        LinkedList<Employee> List = read.readData(); // Linked list returned by the readData function
        int d = List.size();
        int count = 0;
        for(int i = 0; i<d; i++){
            String married = List.get(i).getMaritalstatus();
            if(married.compareTo("Married")==0){
                count++;
            }
            else{}
        }
        System.out.println("Total count of people who are married - "+count);
    }
}

