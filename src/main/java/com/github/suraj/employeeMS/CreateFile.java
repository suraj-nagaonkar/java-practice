package com.github.suraj.employeeMS;

import java.io.File;
import java.io.IOException;

/**
 * @author 11-03-2022
 */

public class CreateFile {
    public void createFile(){
        File newobj = new File("E:\\Suraj\\File Handling\\Newfile.txt");
        try {
            if (newobj.createNewFile()) {
                System.out.println("File created with a name"+" "+newobj.getName());
            }else{
                System.out.println("File already exits");
            }        }catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
