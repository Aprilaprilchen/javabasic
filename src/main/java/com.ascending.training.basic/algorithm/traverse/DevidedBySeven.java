package com.ascending.training.basic.algorithm.traverse;

public class DevidedBySeven {
    int count;

    public int devidedBy7(int num){
        for (count = 0; num/10>=0; num = num/10){
            if (num==0){
                return count;
            }
            int i = num%10;
            if (i%7 == 0){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args){
        int a = 76;
        DevidedBySeven d = new DevidedBySeven();
        System.out.println(d.devidedBy7(a));
    }
}
