package com.github.suraj.multithreading.multi;

/**
 * @author 27-02-2022
 */

public class MyThread implements Runnable {

    @Override
    public void run() {
        Thread current = Thread.currentThread();
        System.out.println("In Thread " + current.getName());
    }
}
