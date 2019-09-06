package com.ascending.training.basic.dataStructure;

import java.util.Stack;

public class StackTest {

    public static Stack<String> name = new Stack();    
    public static Stack<String> names = new Stack();

    public static void main(String[] args) {

        // add
        name.push("Matt");
        name.push("Jermey");
        name.push("Stephan");
        name.push("Elena");
        System.out.println("names in the stack of name: " + name);

        //take out the top one
        try{
            String name2 = name.pop();
            System.out.println("top name of the stack: " + name2);
            System.out.println("the rest names: " + name);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //have a look of the top one and keep it in original stack
        try{
            String name3 = name.peek();
            System.out.println("top name of the stack: " + name3);
            System.out.println("the rest names: " + name);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //check if the stack is empty
        System.out.println("Whether the stack name is empty? " + name.isEmpty());
        System.out.println("Whether the stack names is empty? " + names.isEmpty());

        //find the size of stack
        System.out.println("the stack size is: " + name.size());

        //search for an element
        int position = name.search("Elena");

        if (position != -1){
            System.out.println("Elena is in position" + position);
        }else {
            System.out.println("She is not in the stack of name");
        }
    }
}
