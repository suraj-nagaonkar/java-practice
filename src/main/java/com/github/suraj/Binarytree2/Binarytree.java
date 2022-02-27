package com.github.suraj.Binarytree2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 21-02-2022
 */

public class Binarytree {

    private static Node root;

    public static Node createTree(int element){
        Node root = new Node(element);
        Node n20 = new Node(20);
        Node n30 = new Node(30);
        Node n40 = new Node(40);
        Node n50 = new Node(50);
        Node n60 = new Node(60);
        root.setLeft(n20);
        root.setRight(n50);
        n20.setLeft(n30);
        n20.setRight(n40);
        n50.setRight(n60);
        return root;
    }

    public static void preorder(Node root){
        if (root == null){
            return;
        }
        System.out.print(root.getElement()+" ");
        preorder(root.getLeft());
        preorder(root.getRight());
    }

    public static void inorder(Node root){
        if (root == null){
            return;
        }
        inorder(root.getLeft());
        System.out.print(root.getElement()+" ");
        inorder(root.getRight());
    }

    public static void postorder(Node root){
        if (root == null){
            return;
        }
        inorder(root.getLeft());
        inorder(root.getRight());
        System.out.print(root.getElement()+" ");
    }

    public static void levelOrder(Node root){
        if (root == null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currentNode = q.remove();

            if(currentNode == null){
                System.out.println();

                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }

            else{
                System.out.print(currentNode.getElement()+" ");

                if(currentNode.getLeft() != null){
                    q.add(currentNode.getLeft());
                }

                if(currentNode.getRight() != null){
                    q.add(currentNode.getRight());
                }
            }
        }
    }

    public static void search(Node root, int key) {
        if (root == null) {
            System.out.print("Tree is empty");
        }

        Node current = root;

        while (current != null) {
            if (key == current.getElement()) {
                System.out.println("Element exists in the tree");
            }

            else if (key < current.getElement()) {
                current = current.getLeft();
            }

            else {
                current = current.getRight();
            }
        }
    }

    public static void main(String args[]){
        Binarytree tree = new Binarytree();
        Node root = tree.createTree(10);
        System.out.print("Preorder : ");
        preorder(root);
        System.out.println();
        System.out.print("Inorder : ");
        inorder(root);
        System.out.println();
        System.out.print("Postorder : ");
        postorder(root);
        System.out.println();
        levelOrder(root);
        System.out.println();
        search(root, 20);
    }
}
