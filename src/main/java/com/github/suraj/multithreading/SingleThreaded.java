package com.github.suraj.multithreading;

/**
 * @author 27-02-2022
 */

public class SingleThreaded {

    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println("before sleeping");
        try {
            mainThread.sleep(5000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("after waking up");
    }
}
