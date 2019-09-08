package com.ascending.training.basic.algorithm.LeetCode;

        import java.util.ArrayList;
        import java.util.List;
        import java.util.Stack;

public class BaseballGame {

    public int calPoints(String[] ops) {
        int sum = 0;
        Stack<Integer> baseball = new Stack<>();

        for(int i=0; i<ops.length; i++){
            try{
                int n = Integer.parseInt(ops[i]);
                baseball.push(n);
            }catch (Exception e){
                if(ops[i].equals("C")){baseball.pop();}
                if(ops[i].equals("D")){baseball.push(2*(baseball.peek()));}
                if(ops[i].equals("+")){
                    Integer n = baseball.pop();
                    Integer m = baseball.pop();
                    baseball.push(m);
                    baseball.push(n);
                    baseball.push(n + m);
                }
            }
        }

//        List<Integer> list = new ArrayList<>();
//        list.addAll(baseball);
//        int[] n = new int[list.size()];
//        for(int i = 0; i<list.size(); i++){
//            n[i] = list.get(i);
//        }
        for(int i=0; baseball.size() > 0; i++){
            sum = sum + baseball.pop();
        }

        return sum;
    }

    public static void main(String[] args){
        String[] ops = {"5", "2", "C", "D", "+"};
        BaseballGame s = new BaseballGame();
        int sum = s.calPoints(ops);
        System.out.println("sum number is: " + sum);
    }

}
