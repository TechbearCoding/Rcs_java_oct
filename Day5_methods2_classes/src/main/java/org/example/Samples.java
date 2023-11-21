package org.example;

import java.util.Scanner;

public class Samples {
    private static int c = 3;
    public static void sample1(){
        int a = sum();
        System.out.println(a);
    }

    private static int sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet skaitli!");
        int sk1 = sc.nextInt();

        System.out.println("Ievadiet skaitli!");
        int sk2 = sc.nextInt();
        System.out.println(c);

        return sk1 + sk2;
    }

    public static int biggestNumber(int a, int b){
        System.out.println(c);

        if(a > b){
            return a;
        }
        return b;
    }
}
