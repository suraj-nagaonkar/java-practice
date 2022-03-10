package com.github.suraj.filehandling;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author 10-03-2022
 */

public class ReadFromFile {
    public static void main(String[] args) {
        try {
            FileReader myobj = new FileReader("E:\\Suraj\\File Handling\\Newfile.txt");
            Scanner myreader = new Scanner(myobj);
           while(myreader.hasNextLine()){
               System.out.println("Reading data from the file");
               try {
                   Thread.sleep(3000);
               }
               catch (InterruptedException e) {
                   e.printStackTrace();
               }
               String data = myreader.nextLine();
               System.out.println("Data from the file - "+ data);
           }
           myreader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Error occured");
            e.printStackTrace();
        }
    }
}
