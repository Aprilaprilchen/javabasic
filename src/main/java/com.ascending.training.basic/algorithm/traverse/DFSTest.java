package com.ascending.training.basic.algorithm.traverse;

public class DFSTest {

    public static void preorder(Node root){
        if (root != null){
            System.out.println(root);
        }else {return;}
        if (root.left != null){
            preorder(root.left);
        }
        if (root.right != null){
            preorder(root.right);
        }
    }

    public static void inorder(Node root){
        if (root.left != null){
            inorder(root.left);
        }
        if (root != null){
            System.out.println(root);
        }else{
            return;
        }
        if (root.right != null){
            inorder(root.right);
        }
    }

    public static void postorder(Node root){
        if (root.left != null){
            postorder(root.left);
        }
        if (root.right != null){
            postorder(root.right);
        }
        if (root != null){
            System.out.println(root);
        }else {
            return;
        }
    }

    public static void main(String[] args){
        DFSTest dfs = new DFSTest();
        Node root = new Node("A");
        Node left = new Node("B");
        Node right = new Node("E");
        root.left = left;
        root.right = right;
        left.right = new Node("C");
        left.right.left = new Node("D");
        right.right = new Node("F");
        right.right.left = new Node("G");
        right.right.left.left = new Node("H");
        right.right.left.right = new Node("K");

        System.out.println("This is the result of preorder: ");
        dfs.preorder(root);
        System.out.println("This is the result of inorder: ");
        dfs.inorder(root);
        System.out.println("This is the result of postorder: ");
        dfs.postorder(root);
    }

    static class Node{
        String key;
        Node left;
        Node right;

        public Node(String key){
            this.key = key;
        }
        @Override
        public String toString(){
            return String.valueOf(key);
        }
    }
}
