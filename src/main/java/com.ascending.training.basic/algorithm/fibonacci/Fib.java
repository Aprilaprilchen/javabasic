package com.ascending.training.basic.algorithm.fibonacci;

public class Fib {
    public long fib(long n){
        if (n == 1)return 1;
        if (n == 2)return 2;
        if (n == n)return fib(n-1) + fib(n-2);

        return fib(n);
    }

    public static void main(String[] args){
        Fib f = new Fib();
        f.fib(50);
        double a=4.141;

    }
}
