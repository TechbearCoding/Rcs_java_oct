package org.example;

import java.util.Scanner;

public class Tasks {
    public static int biggestNumber(int count){
        int biggest = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < count; i++){
            System.out.println("Ievadiet skaitli!");
            int number = sc.nextInt();

            if(number > biggest){
                biggest = number;
            }
        }

        return biggest;
    }
}
