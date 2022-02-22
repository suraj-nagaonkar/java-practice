package com.github.suraj.Binarytree1;

import java.util.*;
import java.util.List;

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
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currentnode = q.remove();

            if (currentnode == null){
                System.out.println();
                if (q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else {
                System.out.print(currentnode.getElement()+" ");
                if (currentnode.getLeft() != null){
                    q.add(currentnode.getLeft());
                }
                if (currentnode.getRight() != null){
                    q.add(currentnode.getRight());
                }
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
    }
}
