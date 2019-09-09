package com.ascending.training.basic.algorithm.linkedList;

import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MiddleNode {
    public void countMiddle(Node n){
        Node node1 = n;
        Node node2 = n;
        while (node2.next != null){
            node1 = node1.next;
            node2 = node2.next.next;
        }
        System.out.println(node1);
    }

    public static void main(String[] args){
        MiddleNode md = new MiddleNode();
        Node n = new Node(3);
        n.next = new Node(2);
        n.next.next = new Node(1);
        n.next.next.next = new Node(6);
        n.next.next.next.next = new Node(9);

        md.countMiddle(n);
    }

    static class Node{
        Integer value;
        Node next;

        Node(int v){
            value = v;
        }

        @Override
        public String toString(){
            return String.valueOf(value);
        }
    }
}
