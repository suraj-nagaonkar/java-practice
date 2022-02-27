package com.github.suraj.exception;



/**
 * @author 27-02-2022
 */

public class Exception extends Throwable {
    public static void main(String args[]){
        try {
            int a = 500 / 0;
        }catch(ArithmeticException e){
            System.out.println("Exception handled properly");
        }
    }
}
