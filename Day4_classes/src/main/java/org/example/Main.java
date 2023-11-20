package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String a = sampleFull("aaaaa", "bbbbbb", "cccccc");
        System.out.println(a);

//        int result = sampleWithReturn();
//        System.out.println(result);
    }

    public static String sampleFull(String a, String b, String c){
        String result = c + b + a;
        if(result.length() <= 15){
            return result;
        }else{
            return c + a;
        }
    }
    public static String anotherSample(){
        return "aaa" + "bbb";
    }

    public static int sampleWithReturn(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet skaitli!");
        int a = sc.nextInt();

        System.out.println("Ievadiet skaitli!");
        int b = sc.nextInt();

        int c = a + b;

        return c;
    }

    public static void task2b(int count) {
        if(count < 1){
            count = 1;
        }
        String symbol = "";
        for (int i = 0; i < count; i++) {
            symbol = symbol + "$";
            System.out.println(symbol);
        }
    }

    public static void task2(int count) {
        if(count > 0){
            String symbol = "";
            for (int i = 0; i < count; i++) {
                symbol = symbol + "$";
                System.out.println(symbol);
            }
        }else{
            System.out.println("$");
        }
    }

    public static void task1(String a, String b, String c){
        System.out.println(c + b + a);
    }

    public static void sample1(){
        sampleWithParams(2, 5);
        sampleWithParams(99, -15);

        anotherSampleWithParams("hjklasjhkasdjhk");

        String c = "aaaaaaaaaaaaaaaaaa";
        anotherSampleWithParams(c);

        c = "aa2";
        anotherSampleWithParams(c);
    }
    public static void anotherSampleWithParams(String a){
        System.out.println(a);
    }

    public static void sampleWithParams(int a, int b){
        System.out.println("Summa ir:");
        System.out.println(a + b);
    }


}