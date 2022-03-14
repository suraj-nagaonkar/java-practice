package com.github.suraj.filehandling;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author 10-03-2022
 */

public class DeleteFile {
    public static void main(String[] args){
        File obj = new File("E:\\Suraj\\File Handling\\Newfile.txt");
        if (obj.delete()) {
            System.out.println("The deleted file is "+obj.getName());
        }else{
            System.out.println("Failed in deleting the file");
        }
    }
}

