package com.github.suraj.Binarypreordertree;

/**
 * @author 18-02-2022
 */

public class BinaryTressYT{

    static class Binarytree{
        static int idx = -1;
        public static Node buildtree(int nodes[]){
            idx++;
            if (nodes[idx] == -1){
                return null;
            }
            Node node = new Node(nodes[idx]);
            node.left = buildtree(nodes);
            node.right = buildtree(nodes);
            return node;
        }
    }

    public static void preorder(Node root){
        if (root == null){
            return;
        }
        System.out.print(root.data +" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root){
        if (root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void postorder(Node root){
        if (root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String args[]){
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Binarytree tree = new Binarytree();
        Node root = tree.buildtree(nodes);
        postorder(root);
    }
}
