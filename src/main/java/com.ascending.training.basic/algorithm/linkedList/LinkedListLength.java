package com.ascending.training.basic.algorithm.linkedList;

public class LinkedListLength {

    public void countLength(Node node){
        int i = 0;
        Node temp = node;
        while (temp != null){
            temp = temp.next;
            i++;
        }
        System.out.println(i);
    }

    public static void main(String[] args){
        LinkedListLength lll = new LinkedListLength();
        Node node = new Node(5);
        node.next  = new Node(6);
        node.next.next = new Node(8);

        lll.countLength(node);
    }


    static class Node{
        Integer value;
        Node next;

        public Node(int v){
            value = v;
        }
    }
}
