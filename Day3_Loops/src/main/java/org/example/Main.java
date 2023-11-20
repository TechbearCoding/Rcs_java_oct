package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //homework2();
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
    public static void homework2(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet skaitli!");
        int input = sc.nextInt();

        int last = Integer.MIN_VALUE;

        while(input > last){
            System.out.println(input);
            last = input;

            System.out.println("Ievadiet skaitli!");
            input = sc.nextInt();
        }

    }
    public static void homework1(){
        String symbol = "";
        for(int i = 0; i < 5; i++){
            symbol = symbol + "$";
            System.out.println(symbol);
        }

        for(int i = 0; i < 5; i++){
            for(int j = 0; j <= i; j++ ){
                System.out.print("$");
            }
            System.out.println();
        }
    }
    public static void task4(){
        Scanner sc = new Scanner(System.in);
        String word = "Unicorn";

        String input = "";

        while(!input.equals(word)){
            System.out.println("Uzmini vārdu!");
            input = sc.nextLine();

            if(!input.equals(word)){
                System.out.println("Mēģini vēlreiz!");
            }
        }

        System.out.println("Uzminēji!");
    }
    public static void sample6(){
        //Uztaisīt ciklu, kas darbojas kamēr lietotājs neievada negatīvu skaitli
        //Izvadīt skaitļu summu
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int input = 0;

        while(input >= 0 ){

            System.out.println("Ievadiet skaitli!");
            input = sc.nextInt();
            if(input < 0){
                break;
            }

            sum = sum + input;
        }

        System.out.println("Summa ir " + sum);
    }

    public static void sample5(){
        Scanner sc = new Scanner(System.in);
        String input = "";
        //cikls darbojas, kamer cilveks neuzraksta vardu "exit"
        while(!input.equals("exit")){
            System.out.println("Hello world!");

            System.out.println("Ievadīt simbolu virkni!");
            input = sc.nextLine();
        }
    }

    public static void task3(){
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for(int i = 0; i < 5; i++){
            System.out.println("Lūdzu ievadiet skaitli!");
            int number = sc.nextInt();

            if(number > 0){
                sum = sum + number;
            }else{
                System.out.println("Kļūda!");
            }
        }
        System.out.println("Summa ir " + sum);
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