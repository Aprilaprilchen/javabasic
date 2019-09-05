package com.ascending.training.basic.algorithm.fibonacci;

public class Fibonacci {

//    Fibonacci(int n){
//
//    }

    public int resolveFib(int n){
        int[] a = new int[n+1];
        a[0]=1;
        for (int i=0; i<=6; i++) {
            a[1] = 2;
        }

        for (int i=2; i<=n; i++){
            a[i] = a[i-1] + a[i-2];

            System.out.println(a[n-1]);
        }
        return a[n];
    }
    public static void main(String[] args){
        Fibonacci f = new Fibonacci();
        int result = f.resolveFib(30);
        System.out.println(result);
    }
}
