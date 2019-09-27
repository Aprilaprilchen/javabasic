package com.ascending.training.basic.algorithm.linkedList;

public class FindMerge {

    public static Node findMerge(Node node){
        Node node1 = node;
        Node node2 = node;
//        use do while to avoid NullPointerException
        do {
            node1 = node1.next;
            node2 = node2.next.next;
        }while (node1 != node2 && node2.next != null);
        if (node2.next == null)
            System.out.println("There is no merge");
        if (node1.value == node2.value){
            System.out.println("There is merge exist");
        }

        return node1;
    }

    public static void findMergePoint(Node node){

        Node node1 = node;
        Node node2 = findMerge(node);
        for (node1 = node; node1 != node2; node1 = node1.next){
            do {
                node2 = node2.next;
            } while (node2 != findMerge(node) && node1 != node2);
            if (node1 == node2){
                break;
            }
        }System.out.println(node1.value);
    }

    public static void main(String[] args){
        FindMerge fm = new FindMerge();
        Node n = new Node(3);
        n.next = new Node(2);
        n.next.next = new Node(1);
        n.next.next.next = new Node(6);
        n.next.next.next.next = new Node(9);
        n.next.next.next.next.next = new Node(7);
        n.next.next.next.next.next.next = n.next.next;

        fm.findMerge(n);
        fm.findMergePoint(n);
    }
    static class Node{
        Integer value;
        Node next;
        Node(int v){
            value = v;
        }
    }
}
