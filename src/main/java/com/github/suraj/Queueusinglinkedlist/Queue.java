package com.github.suraj.Queueusinglinkedlist;

/**
 * @author 17-02-2022
 */

public class Queue implements List {
    Node head;
    Node tail;
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.getNext();
    }

    public void addLast(int element) {
       Node node = new Node(element);
       if (head == null){
           head = node;
           return;
       }
       Node current = head;
       while(current.getNext() != null){
        current = current.getNext();
       }
       current.setNext(node);
       node.setNext(null);
    }

    public void print(){
        Node current = head;

        while (current != null){
            System.out.print(current.getElement()+ "->");
            current = current.getNext();
        }
        System.out.print("Null");
    }

    public static void main(String args []){
        Queue q1 = new Queue();
        q1.addLast(1);
        q1.addLast(2);
        q1.addLast(3);
        q1.print();
        q1.deleteFirst();
        System.out.println();
        q1.print();
        q1.deleteFirst();
        System.out.println();
        q1.print();
    }
}
