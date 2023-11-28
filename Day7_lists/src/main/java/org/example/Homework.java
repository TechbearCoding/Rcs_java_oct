package org.example;

import java.util.Arrays;

public class Homework {

    public static int task1(int[] arr){
        int sum = 0;
//
//        for(int i = 0; i < arr.length; i++){
//            sum+=arr[i];
//        }
        for(int element : arr){
            sum += element;
        }

        return sum;
    }

    public static double task2(int[] a) {
        double sum = task1(a);
        return sum/a.length;
    }
}
