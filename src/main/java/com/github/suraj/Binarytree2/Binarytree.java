package com.github.suraj.Binarytree2;

/**
 * @author 21-02-2022
 */

public class Binarytree {

    static Node root;
    static class Binary {
        public static Node buildTree(int element[]) {

            int indx = -1;
            indx++;

            if (element[indx] == -1) {
                return null;
            }
            Node node = new Node(element[indx]);
            node.setLeft(buildTree(element));
            node.setRight(buildTree(element));
            return node;
        }
    }


    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.getElement() + " ");
        preorder(root.getLeft());
       preorder(root.getRight());
    }

    public static void inorder(Node root){
        if (root == null){
            return;
        }
        inorder(root.getLeft());
        System.out.print(root);
        inorder(root.getLeft());
    }

    public static void postorder(Node root){
        if (root == null){
            return;
        }
        postorder(root.getLeft());
        postorder(root.getRight());
        System.out.print(root);
    }

    public static void main(String args[]) {
        int element[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Binary tree = new Binary();
        root = tree.buildTree(element);
        preorder(root);
        inorder(root);
        postorder(root);
    }
}
