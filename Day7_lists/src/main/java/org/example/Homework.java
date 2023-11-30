package org.example;

import java.util.Arrays;
import java.util.Scanner;

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

    public static int task3(){
        int number = 0;
        boolean done = false;
        while(!done){
            System.out.println("Ievadiet skaitli!");
            Scanner sc = new Scanner(System.in);
            try{
                number = sc.nextInt();
                done = true;
            }
            catch(Exception e){
                System.out.println("Ievades kļūda");
            }

        }
        return number;
    }
}
