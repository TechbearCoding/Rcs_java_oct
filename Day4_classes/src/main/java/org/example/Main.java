package org.example;

public class Main {
    public static void main(String[] args) {
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