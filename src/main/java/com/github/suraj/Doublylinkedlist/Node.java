package com.github.suraj.Doublylinkedlist;

/**
 * @author 14-02-2022
 */

public class Node {
    private int element;
    private Node next = null;
    private Node previous = null;

    Node (int element){
        this.element = element;
        this.next = null;
        this.previous = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }



    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }


    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }
}
