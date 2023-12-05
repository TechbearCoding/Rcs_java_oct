package org.example;

public class Pet {
    public String name;
    public int age;
    public String type;
    public String ownerMail;

    public Pet(String name, int age, String type, String ownerMail){
        this.name = name;
        this.age = age;
        this.type = type;
        this.ownerMail = ownerMail;
    }

    public void print(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(type);
        System.out.println(ownerMail);

        System.out.println("--------------");
    }
}
