package com.ascending.training.basic.algorithm.linkedList;

public class Node {
    Integer value;
    Node next;

    public int count(Node n){
        int count = 1;
        Node temp = n;
        temp = temp.next;
        while(temp!=null){
            count++;
        }
        return count;
    }



    public static void main(String[] args){
//        Node root = new Node(5);
//        root.next = new Node(2);
//        root.next.next = new Node(4);
    }

}
