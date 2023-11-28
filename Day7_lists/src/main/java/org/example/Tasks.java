package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    public static void task2(){
        List<String> stringList = new ArrayList<>();
        System.out.println("Ievadiet cik vērtības gribat!");
        Scanner sc = new Scanner(System.in);
        int listLen;
        try{
            listLen = sc.nextInt();
        }
        catch(Exception e){
            listLen = 2;
        }

        for(int i = 0; i < listLen; i++){
            System.out.println("Ievadiet vērtību");
            stringList.add(sc.next());
        }

        System.out.println("Ievadiet 1, ja gribat izvadīt visu sarakstu, 2, ja vērtību!");
        String input = sc.next();

        if(input.equals("1")){
            for(String el : stringList){
                System.out.println(el);
            }
        }else if(input.equals("2")){
            try{
                System.out.println("Ievadiet indeksu!");
                int i = sc.nextInt();
                System.out.println(stringList.get(i));
            }catch(Exception ex){
                System.out.println("Kļūda ievadē");
            }

        }else{
            System.out.println("Nepareiza ievade!");
        }
    }
}
