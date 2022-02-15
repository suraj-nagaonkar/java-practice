package com.github.suraj.Circularlinkedlist;

/**
 * @author 15-02-2022
 */

public class Node {

    private int element;
    private Node next;
    private Node tail;

    Node (int element){
        this.element = element;
        this.next = null;
        this.tail = null;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

}
