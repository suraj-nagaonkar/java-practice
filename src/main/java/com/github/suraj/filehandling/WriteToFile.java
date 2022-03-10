package com.github.suraj.filehandling;
import java.io.FileWriter;
import java.io.IOException;
/**
 * @author 10-03-2022
 */

public class WriteToFile {
    public static void main(String[] args){
        try {
            FileWriter mywriter = new FileWriter("E:\\Suraj\\File Handling\\Newfile.txt");
            mywriter.write("Lay kanda alay kay????");
            mywriter.close();
            System.out.println("Succesfully wrote to the file");
        }catch(IOException e){
            System.out.println("Error resolved");
            e.printStackTrace();
        }
    }
}

