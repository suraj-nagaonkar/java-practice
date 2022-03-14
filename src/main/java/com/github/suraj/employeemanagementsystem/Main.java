package com.github.suraj.employeemanagementsystem;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author 10-03-2022
 */

public class Main extends EmployeeFileCreation {
    public static void main(String[] args){
        EmployeeFileCreation Details = new EmployeeFileCreation();
        String data = Details.fileRead();
    }
}
