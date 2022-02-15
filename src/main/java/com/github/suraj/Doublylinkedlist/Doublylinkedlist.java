package com.github.suraj.Doublylinkedlist;

/**
 * @author 14-02-2022
 */

public class Doublylinkedlist implements List{
    Node head;

    public void addFirst(int element){
        Node newNode = new Node(element);

        if (head==null){
            head = newNode;
            return;
        }
        newNode.setNext(head);
        newNode.setPrevious(null);
        head.setPrevious(newNode);
        head = newNode;
    }

    public void addLast(int element){
        Node newnode = new Node(element);
        Node current = head;
        while (current.getNext() != null){
            current = current.getNext();
            if (head == null){
                newnode.setPrevious(head);
                head.setNext(newnode);
                newnode.setNext(null);
                return;
            }
            newnode.setPrevious(current);
            current.setNext(newnode);
            newnode.setNext(null);
        }
    }

    public int getSize(){
        Node current = head;
        int counter = 0;
        while (current != null){
            current = current.getNext();
            counter++;
        }
        return counter;
    }

    public void print(){
        Node current = head;
        Node prev = head;
        while (current != null){
            System.out.print(current.getElement() + "->");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public void add(int index, int element){
        Node newnode =new Node(element);
        Node current = head;
        Node prev = head;
        int counter = 0;
        if (head == null){
            head = newnode;
        }

        else if (index > -1 && index < getSize()){
            if (index == 0){
                addFirst(element);
                return;
            }

            else {
                while (counter < index && current.getNext() != null ){
                    prev = current;
                    current = current.getNext();
                }
                if (current != null) {
                    prev.setNext(newnode);
                    newnode.setPrevious(prev);
                    newnode.setNext(current);
                    current.setPrevious(newnode);
                }
            }
        }
    }

    public void deleteFirst(){
        head = head.getNext();
    }

    public void deleteLast(){
        Node current = head;
        Node prev = head;
        if (head == null){
            System.out.println("List is empty");
        }
        else{
            while(current.getNext() != null){
                prev = current;
                current = current.getNext();
            }

            if (current != null){
                current = null;
                prev.setNext(current);
            }
        }
    }

    public void delete(int index){
        if (head == null){
            System.out.println("List is empty");
        }

        else if (index > -1 && index < getSize()){
            if (index == 0){
                deleteFirst();
                return;
            }
            else {
                Node current = head;
                Node prev = head;
                int counter = 0;

                while (counter < index && current.getNext() != null) {
                    prev = current;
                    current = current.getNext();
                    counter++;
                }

                if (current != null) {
                    prev.setNext(current.getNext());
                }
            }
        }
    }

    public void getElement(int index){
        if (head == null){
            System.out.println("List is empty");
        }

        else if (index > -1 && index < getSize()){
            Node current = head;
            int counter = 0;
            while (counter<index && current.getNext() != null){
                current = current.getNext();
                counter++;
            }
            System.out.println("The element at the given index is: " + current.getElement());
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void emptyList() {
        head = null;
    }


    public static  void main(String args []){
        Doublylinkedlist list = new Doublylinkedlist();
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(12);
        list.add(1,5);
        list.print();
        list.getElement(0);
        System.out.println();
        list.print();
        list.isEmpty();
        list.emptyList();
        list.print();
    }
}
