package com.github.suraj.exception;

/**
 * @author 27-02-2022
 */

public class NPException {
    public static void main(String args[]) {
        try{
            int a[]=new int[5];
            a[5]=30/2;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        System.out.println("rest of the code");
    }
}
