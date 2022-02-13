package com.github.suraj.LL;

/**
 * @author 10-02-2022
 */

public class Node {

    private String data;
    private Node next;
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }



    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }



    public Node(String data) {
        this.data = data;
        this.next = null;
    }
}
