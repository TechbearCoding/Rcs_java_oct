package org.example;

public class Tasks {
    public static double task1(double[] arr) {
        double largest = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}
