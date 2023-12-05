package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tools {
    public static List<Pet> createPetList(int a){
        List<Pet> lst = new ArrayList<>();

        for(int i = 0; i < a; i++){
            addPet(lst);
        }

        return lst;
    }

    public static void addPet(List<Pet> lst) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet mājdzīvnieka vārdu!");
        String name = sc.nextLine();
        System.out.println("Ievadiet mājdzīvnieka tipu!");
        String type = sc.nextLine();
        System.out.println("Ievadiet vecumu!");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Ievadiet saimnieka epastu!");
        String mail = sc.nextLine();

        lst.add(new Pet(name, age, type, mail));
    }
}
