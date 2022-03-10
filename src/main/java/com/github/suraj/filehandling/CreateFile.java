package com.github.suraj.filehandling;
import java.io.File;
import java.io.IOException;

/**
 * @author 10-03-2022
 */

public class CreateFile {
    public static void main(String args[]) throws IOException {
     File newobj = new File("E:\\Suraj\\File Handling\\Newfile.txt");
        try {
            if (newobj.createNewFile()) {
                System.out.println("File created with a name"+" "+newobj.getName());
            }else{
                System.out.println("File already exits");
            }
        }catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}

