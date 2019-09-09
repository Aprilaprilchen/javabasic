package com.ascending.training.basic.algorithm.traverse;

import java.util.LinkedList;
import java.util.Queue;

public class BFSTest {

    public static void bfs(Node root){
        Queue<Node> queue = new LinkedList<>();
        if (root != null){
            queue.offer(root);
        }else {
            return;
        }
        while (queue.size()!= 0){
            Node templateNode = queue.poll();
            System.out.println(templateNode);
            if (templateNode.left != null){
                queue.offer(templateNode.left);
            }
            if (templateNode.right != null){
                queue.offer(templateNode.right);
            }
        }
    }


    public static void main(String[] args){
        BFSTest bfs = new BFSTest();
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

        bfs.bfs(root);
    }

    static class Node{
        String root;
        Node left;
        Node right;

        public Node(String root){
            this.root = root;
        }

        @Override
        public String toString(){
            return String.valueOf(root);
        }
    }
}
