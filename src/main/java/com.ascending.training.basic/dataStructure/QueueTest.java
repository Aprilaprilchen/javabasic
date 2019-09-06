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

        System.out.println("The original queue" + number);

        int n = number.remove();
        System.out.println("the top number" + n);
        System.out.println("the new queue" + number);

        int m = number.peek();

    }
}
