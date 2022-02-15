package com.github.suraj.Circularlinkedlist;

/**
 * @author 15-02-2022
 */

public class Circular implements List{
    Node head;

    public void addFirst(int element){
        Node node = new Node(element);
        if (head == null){
            head = node;
            node.setNext(head);
        }

        else {
            Node current = head;
            do {
                current = current.getNext();
            } while(current.getNext() != head);
            node.setNext(head);
            head = node;
            current.setNext(head);
        }
    }

    public void print(){
        if (head == null){
            System.out.println("List is empty");
        }

        else{
            Node current = head;
            do{
               System.out.print(current.getElement()+"->");
                current = current.getNext();
            } while (current != head);
            System.out.print("Reached head");
        }
    }

    public int getSize() {
        //Calculating size of an list
        int length = 0;
        Node current = head;
        while (current != null) {
            current = current.getNext();
            length++;
        }
        System.out.println(length);
        return length;
    }

    public void delete(int index){
        if (head != null && index > -1){
            if (index == 0){
                head = head.getNext();
            }

            else {
                Node current = head;
                Node prev = head;
                int count = 0;
                do {
                    prev = current;
                    current = current.getNext();
                    count++;
                } while(count < index && current.getNext() != head );

                if (current != head){
                    prev.setNext(current.getNext());
                }
            }
        }
    }

    public void add(int element, int index){
        Node node = new Node(element);
        if (index > -1) {
            if (index == 0){
                addFirst(element);
            }

            else {
                int count = 0;
                Node current = head;
                Node prev = head;
                do {
                    prev = current;
                    current = current.getNext();
                    count++;
                } while(count < index);
                prev.setNext(node);
                node.setNext(current);
            }
        }
    }

    public static void main (String args[]){
        Circular list = new Circular();
        list.addFirst(0);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.print();
        list.add(1,3);
        System.out.println();
        list.print();
    }
}
