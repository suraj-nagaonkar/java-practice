package com.github.suraj.Binarytree2;

/**
 * @author 21-02-2022
 */

public class Node {
    private int element;
    private Node left;
    private Node right;

    Node(int element){
        this.element = element;
        this.left = null;
        this.right = null;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

}
