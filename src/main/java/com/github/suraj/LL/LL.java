package com.github.suraj.LL;

/**
 * @author 10-02-2022
 */

class LL implements list{
     Node head;

    @Override
    public void addFirst(String data) {
        Node node = new Node(data);
        if (head == null){
            head = node;
            return;
        }
        node.setNext(head);
        head = node;
    }

    @Override
    public void addLast(String data) {
        Node node = new Node(data);
        if (head == null){
            head = node;
            return;
        }
        Node currnode = head;
        while(currnode.getNext()!= null){
            currnode = currnode.getNext();
        }
        currnode.setNext(node);
    }

    @Override
    public void print() {
        Node currnode = head;
        while(currnode != null){
            System.out.print(currnode.getData()+ "->");
            currnode = currnode.getNext();
        }
        System.out.print("Null");
    }

    public static void main(String args[]){
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.addLast("list");
        list.print();
    }
}