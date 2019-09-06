package com.ascending.training.basic.dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static Queue<Integer> number = new LinkedList<>();

    // add elements
    public static void main(){
        number.add(8);
        number.add(2);
        number.add(6);
        number.add(6);
        System.out.println("the original queue: " + number);

        // remove the first value
        int n = number.remove();
        System.out.println("the top number: " + n);
        System.out.println("the new queue: " + number);

        // peek the first value
        int m = number.peek();
        System.out.println("the top number: " + m);
        System.out.println("the new queue: " + number);

        // get the size
        int size = number.size();
        System.out.println("the size of the queue: " + size);
    }
}
