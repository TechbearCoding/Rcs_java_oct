package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(Tasks.biggestNumber(4));
    }

    public static String combineStrings(String param){
        //Uztaisīt metodi, kura paņem vienu string tipa vertību kā parametru
        //Šo vērtību saglabāt citā stringā 10x
        //šo vērtību padot ar return
        //piemērs-> parametrs= "a" -> ar return aaaaaaaaaa

        String result = "";
        for(int i = 0; i < 10; i++){
            result = result + param;
        }

        return result;
    }

    public static void task1(String symbols, int count){

        String sum = "";
        for(int i = 0; i < count; i++){
            sum = sum + " " +symbols;
            System.out.println(sum);
        }

    }
}