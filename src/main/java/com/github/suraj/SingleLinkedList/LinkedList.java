package com.github.suraj.SingleLinkedList;


/**
 * @author 10-02-2022
 */

public class LinkedList implements List {
    Node head;

    @Override
    public void addFirst(int element) {
        Node node = new Node(element);
        if (head == null) {
            head = node;
            return;
        }
        node.setNext(head);
        head = node;
    }

    @Override
    public void addLast(int element) {
        Node node = new Node(element);
        if (head == null) {
            head = node;
            return;
        }
        Node currnode = head;
        while (currnode.getNext() != null) {
            currnode = currnode.getNext();
        }
        currnode.setNext(node);
    }

    @Override
    public void print() {
        Node currnode = head;
        while (currnode != null) {
            System.out.print(currnode.getElement() + "->");
            currnode = currnode.getNext();
        }
        System.out.print("Null");
    }

    @Override
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.getNext();
    }

    @Override
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.getNext() == null) {
            head = null;
            return;
        }
        Node lastnode = head.getNext();
        Node secondlast = head;
        while (lastnode.getNext() != null) {
            lastnode = lastnode.getNext();
            secondlast = secondlast.getNext();
        }
        secondlast.setNext(null);
    }

    @Override
    public void add(int index, int element) {
        Node node = new Node(element);
        if (head == null) {
            head = node;
            return;
        }
        else if (index > -1 && index < getSize()) {
            if (index == 0) {
                addFirst(element);
            }
            else {
                int count = 0;
                Node current = head, previous = head;
                while (count < index && current != null) {
                    previous = current;
                    current = current.getNext();
                    count++;
                }

                if (current != null) {
                    previous.setNext(node);
                    node.setNext(current);
                }
            }
        }
    }

    public void delete(int index) {
        int counter = 0;
        Node current = head, previous = head;
        if (index > -1 && index < getSize() && current != null) {
            if (index == 0) {
                deleteFirst();
                return;
            }
            else {
                while (counter < index && current != null) {
                    previous = current;
                    current = current.getNext();
                    counter++;
                }
                if (current != null) {
                    previous.setNext(current.getNext());
                }
            }
        }
    }

    public int get(int index) {
        int value = 0;
        if (index > -1 && head != null) {
            int counter = 0;
            Node current = head;
            while (counter < index && current != null) {
                current = current.getNext();
                counter++;
            }
            value = current.getElement();
        }
        return value;
    }

    public int getSize() {
        //Calculating size of an list
        int length = 0;
        Node previous = head;
        while (previous != null) {
            previous = previous.getNext();
            length++;
        }
        System.out.println(length);
        return length;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void emptyList() {
        head = null;
    }

    // deleting an element at nth position from last

    public void deleteN(int n) {
        // claculating the position of element 1 pos back of the element to be deleted
        Node previous = head;
        int prevpos = (getSize() - n);
        int i = 1;
        while (i < prevpos && previous != null) {
            previous = previous.getNext();
            i++;
        }
        previous.setNext(previous.getNext().getNext());
    }

    public void findNumber() {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.getElement() == 7) {
                System.out.println("Index is: " + index);
                return;
            }
            current = current.getNext();
            index++;
        }
    }

    public void more25() {
        Node current = head, previous = head;

        while (current != null) {
            if (current.getElement() > 25) {
                if (current == head) {
                    head = head.getNext();
                    current = head;
                    previous = head;
                    continue;
                }
                previous.setNext(current.getNext());
                current = current.getNext();
                continue;
            }
            previous = current;
            current = current.getNext();
        }
    }

    public void reverse() {
        Node current = head;
        Node temp = head;
        Node clone = null;
        while (current != null) {
            temp = current.getNext();
            if (clone == null) {
                clone = current;
                current.setNext(null);
            }
            else {
                current.setNext(clone);
                clone = current;
            }
            current = temp;
        }
        head = clone;
    }

    public void reverse1(){
        Node current = head;
        Node temp = head;
        Node clone = null;
        while (current != null) {
            temp = current.getNext();
            if (clone == null) {
                clone = current;
                head = head.getNext();
            }
            else {
                current.setNext(clone);
                clone = current;
            }
            current = temp;
        }
        head = clone;
    }

    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.addFirst(31);
        list.addLast(20);
        list.addLast(33);
        list.addLast(26);
        list.addLast(35);
        list.addLast(60);
        list.addLast(57);
        list.addLast(8);
        list.print();
        list.reverse();
        System.out.println("\nPrinting reverse list");
        list.print();
    }
}