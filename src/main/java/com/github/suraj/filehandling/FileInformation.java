package com.github.suraj.filehandling;
import java.io.File;
import java.io.IOException;

/**
 * @author 10-03-2022
 */

public class FileInformation {
    public static void main(String [] args){
       try {
           File newobj = new File("E:\\Suraj\\File Handling\\Newfile.txt");
           newobj.createNewFile();
           if (newobj.exists()) {
               System.out.println("File name" + " " + newobj.getName());
               System.out.println("Absolute path - " + newobj.getAbsolutePath());
               System.out.println("Writable - " + newobj.canWrite());
               System.out.println("Readable - " + newobj.canRead());
               System.out.println("File size in bytes - " + newobj.length());
           }
           else {
               System.out.println("File does not exist");
           }
       }catch(IOException e){
           System.out.println("Error handles");
           e.printStackTrace();
       }
    }
}
