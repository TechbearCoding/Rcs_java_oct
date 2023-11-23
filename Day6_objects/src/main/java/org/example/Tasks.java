package org.example;

import java.util.Scanner;

public class Tasks {

    public static void run(){
        inputNumbers();
    }

    private static void inputNumbers(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet skaitli!");
        int input = sc.nextInt();
        int smallest = 0;

        while (true){
            smallest = input;

            System.out.println("Ievadiet skaitli!");
            input = sc.nextInt();

            if(input < smallest){
                System.out.println("Hello world!");
            }else{
                break;
            }
        }
    }
    public static double averageNumber(int count){
        Scanner sc = new Scanner(System.in);

        double sum = 0;
        for(int i = 0; i < count; i++){
            System.out.println("Ievadiet skaitli!");
            double number = sc.nextDouble();
            //sum = sum + number;
            sum+=number;
        }
        return sum/count;

    }

    public static void task3() {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[5];

        for(int i = 0; i < arr.length; i++){
            System.out.println("Ievadiet vērtību!");
            arr[i] = sc.nextLine();
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + ", " + arr[i].length());
        }
    }
}
