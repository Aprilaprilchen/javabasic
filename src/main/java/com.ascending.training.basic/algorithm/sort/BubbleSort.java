package com.ascending.training.basic.algorithm.sort;

import java.util.Arrays;

public class BubbleSort {

    public void bubble(int[] arr){
        int temp;
        Boolean ifChange;
        for (int i=0; i<arr.length; i++){
            ifChange = false;
            for (int j=0; j<arr.length-1-i; j++){
                if (arr[j+1]<arr[j]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    ifChange = true;
                }
            }
            if (ifChange == false)break;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args){
        int[] arr = {5, 4, 2, 0, 0, 6, 7, 9, 8};
        BubbleSort bs = new BubbleSort();
        bs.bubble(arr);
    }
}
