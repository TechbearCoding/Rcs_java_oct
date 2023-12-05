package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pet> lst = Tools.createPetList(1);
        Tools.addPet(lst);

        printLst(lst);
    }

    private static void printLst(List<Pet> lst){
        for(var pet: lst){
            pet.print();
        }
    }
}