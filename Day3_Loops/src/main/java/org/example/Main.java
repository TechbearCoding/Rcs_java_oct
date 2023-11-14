package org.example;

public class Main {
    public static void main(String[] args) {
        sample1();
    }

    public static void sample1(){

        for(int i = 0; i < 5; i++){ //sākam skaitīt ar 0, cikls darbojas kamēr i ir mazāks par 5, i=i+1
            System.out.println(i);
            System.out.println("Hello world!");
            System.out.println("-------------");
        }
    }
}