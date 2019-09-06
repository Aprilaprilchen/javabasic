package com.ascending.training.basic.dataStructure;
import java.util.Stack;

public class stackAndQueue {
    public static Stack<String> name = new Stack<>();

    public static void main(String[] args) {

        // add
        name.push("Matt");
        name.push("Jermey");
        name.push("Stephan");
        name.push("Elena");
        System.out.println("first stack" + name);

        //take out the top one
        try{
            String name2 = name.pop();
            System.out.println("top name of the stack" + name2);
            System.out.println("the rest names" + name);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //have a look of the top one and keep it in original stack
        try{
            String name3 = name.peek();
            System.out.println("top name of the stack" + name3);
            System.out.println("the rest names" + name);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
