package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String a = "aaa";
//        int b = a.length();

        sample4();
//        task2();
    }

    public static void sample4(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Lūdzu ievadiet skaitli!");
        int number = sc.nextInt();

        if(number == 5){
            for(int i = 0; i < 5; i++){
                System.out.println("hello");
            }
        }else{
            System.out.println("Kļūda");
        }
    }

    public static void sample3(){
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.println("Lūdzu ievadiet skaitli!");
            int number = sc.nextInt();

            if(number == 0){
                System.out.println("Kļūda");
            }else if(number == 4){
                System.out.println("Hello world!");
            }else{
                System.out.println("Hello world!2");
            }
        }
    }

    public static void task2(){
        Scanner sc = new Scanner(System.in);

        int len = 0;
        for(int i = 0; i < 5; i++){
            System.out.println("Ievadīt simbolu virkni!");
            String input = sc.nextLine();
            len = len + input.length();
        }
        System.out.println("Kopējais garums ir " + len);
    }

    public static void sample2(){
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for(int i = 0; i < 3; i++){
            System.out.println("Lūdzu ievadiet skaitli!");
            int number = sc.nextInt();
            sum = sum + number;
            System.out.println(number);
            System.out.println("-------------");

        }
        System.out.println("Summa ir " + sum);

    }

    public static void task1(){
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 7; i++){
            System.out.println("Lūdzu ievadiet skaitli!");
            int number = sc.nextInt();
            System.out.println(number + 5);
        }
    }

    public static void sample1(){

        for(int i = 0; i < 5; i++){ //sākam skaitīt ar 0, cikls darbojas kamēr i ir mazāks par 5, i=i+1
            System.out.println(i);
            System.out.println("Hello world!");
            System.out.println("-------------");
        }
    }
}