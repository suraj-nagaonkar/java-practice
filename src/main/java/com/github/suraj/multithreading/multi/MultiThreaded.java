package com.github.suraj.multithreading.multi;

/**
 * @author 27-02-2022
 */

public class MultiThreaded {

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();

        for (int i = 1; i <= 20; i++) {
            Thread thread = new Thread(myThread);
            thread.setName("Thread " + i);
            thread.start();
        }
    }
}
