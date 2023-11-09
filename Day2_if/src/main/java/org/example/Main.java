package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sample4();
    }

    public static void sample4(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet vārdu!");
        String b = sc.nextLine();

        int len = b.length(); //simbolu skaits

        if(b.equals("bbb") ){
            System.out.println("ir vienāds");
        }else if(b.length() == 3){
            System.out.println("ir vienāds");
        }


        if(b.equals("bbb") || b.length() == 3){
            System.out.println("ir vienāds");
        }
        // || vai - jaizpildas vienam no nosacijumiem
        // && un - jaizpildas abiem diviem
    }

    static void task2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet skaitli!");
        int a = sc.nextInt();

        if(a > 5){
            System.out.println("###");
        }else{
            System.out.println("####");
        }
    }

    public static void sample3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet 1. skaitli!");
        int a = sc.nextInt();

        //Izvadīt "jā", ja skaitlis ir pozitīvs un "nē", ja skaitlis ir negatīvs un izvadīt kļūdas paziņojumu, ja ir 0
        //>
        //<
        //>=
        //<=
        //==
        //!=
        if(a > 0){
            System.out.println("Jā");
        }else if(a < 0){
            System.out.println("Nē");
        }else{
            System.out.println("Kļūda!");
        }

        //String if
        //ir vai nav vienads
        String b = sc.next();
        if(b.equals("bbb")){
            System.out.println("ir vienāds");
        }

    }

    public static void task1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet 1. skaitli!");
        int a = sc.nextInt();

        System.out.println("Ievadiet 2. skaitli!");
        int b = sc.nextInt();

        System.out.println(a + b);
    }

    public static void sample2(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet skaitli!");
        int a = sc.nextInt();

        System.out.println(a);
    }

    public static void sample1(){
        System.out.println("Ievadi savu vārdu!");

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        System.out.println("Sveiki, " + input);
    }
}

