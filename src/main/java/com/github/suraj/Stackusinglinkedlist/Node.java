package com.github.suraj.Stackusinglinkedlist;

/**
 * @author 17-02-2022
 */

public class Node {
    private int element;
    private Node next;

    Node (int element){
        this.element = element;
        this.next = null;
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
}
