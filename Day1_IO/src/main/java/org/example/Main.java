package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        System.out.println("Mani sauc Mārtiņš");
//        System.out.println("1+2");
//        System.out.println(1+2);
//        System.out.println("aaaa " + "bbb");

//        String a = "aaaaa"; //simbolu virkne
//        System.out.println(a);
//        a = "abc";
//        System.out.println(a + "bbb");
//
//        int b = 1; //Vesels skaitlis
//        b = 2+4;
//        System.out.println(b - 9);
//
//        double c = 4.2;
//        boolean d = true;
//        char e = 'a';

        Scanner sc = new Scanner(System.in);


//        1) Likt lietotājam ievadīt savu vārdu.
//        2) Izvadei ir jābūt- "Sveiki, lietotāja vārds"

//        System.out.println("Ievadiet savu vārdu!");
//        String ievade = sc.nextLine();
//
//        System.out.println("Sveiki, " + ievade);

//        1) Likt lietotājam ievadīt 3 simbolu virknes (atsevišķi)
//                2) Izvadīt otrādā secībā.
//                Piemērs, ja ievada "aa", "bb", "cc"-> ccbbaa

        System.out.println("Ievadiet 1. virkni!");
        String a = sc.nextLine();

        System.out.println("Ievadiet 2. virkni!");
        String b = sc.nextLine();

        System.out.println("Ievadiet 3. virkni!");
        String c = sc.nextLine();

        System.out.println(c + b + a);
    }
}