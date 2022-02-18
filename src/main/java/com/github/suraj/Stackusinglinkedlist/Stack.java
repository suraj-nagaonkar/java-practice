package com.github.suraj.Stackusinglinkedlist;

/**
 * @author 17-02-2022
 */

public class Stack implements List{
    Node head = null;

    @Override
    // add first
    public void push(int element) {
        Node node = new Node(element);
        if (head == null) {
            head = node;
            node.setNext(null);
            return;
        }
        node.setNext(head);
        head = node;
    }


    // Remove first
    @Override
    public void pop() {
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        else{
            head = head.getNext();
        }
    }

    public void print(){
        Node current = head;
        while(current != null){
            System.out.print(current.getElement()+ "->");
            current = current.getNext();
        }
        System.out.print("Null");
    }

    public static void main(String args []){
        Stack s1 = new Stack();
        s1.push(3);
        s1.push(2);
        s1.push(1);
        s1.print();
        s1.pop();
        s1.pop();
        s1.pop();
        System.out.println();
        s1.print();
    }
}

