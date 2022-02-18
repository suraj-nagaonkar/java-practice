package com.github.suraj.Stackuisngarray;

/**
 * @author 17-02-2022
 */

public class QueueY {
    static class Queue {
        static int arr[];
        static int rear = -1;
        static int size;

        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        // add function
        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Array is full");
            }

            else {
                rear++;
                arr[rear] = data;
            }
        }

        public static int deque() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
                int element = arr[rear];
            rear--;
            return element;
            }

        }


    public static void main(String args[]) {
        Queue q1 = new Queue(5);
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        System.out.print("[");
        for (int i = 0; i <= (q1.rear); i++) {
            System.out.print(" " + q1.arr[i] + " ");
        }
        System.out.print("]");
        System.out.println();
        System.out.print(q1.rear);

        q1.deque();
        System.out.println();
        System.out.print("[");
        for (int i = 0; i <= (q1.rear); i++) {
            System.out.print(" " + q1.arr[i] + " ");
        }
        System.out.print("]");
        System.out.println();
        System.out.print(q1.rear);
        q1.deque();
        q1.deque();
        q1.deque();

        System.out.println();
        System.out.print("[");
        for (int i = 0; i <= (q1.rear); i++) {
            System.out.print(" " + q1.arr[i] + " ");
        }
        System.out.print("]");
        System.out.println();
        System.out.print(q1.rear);
        System.out.println();
        System.out.println(q1.isEmpty());
    }
}