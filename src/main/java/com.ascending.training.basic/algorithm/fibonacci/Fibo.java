package com.ascending.training.basic.algorithm.fibonacci;

public class Fibo {

//recursive memo:
    public long fibo(int n, long[] mem){
        if (n==1)return 1;
        if (n==2)return 2;

        mem[n] = fibo(n-1, mem) +fibo(n-2, mem);

        return fibo(n, mem);
    }
}
