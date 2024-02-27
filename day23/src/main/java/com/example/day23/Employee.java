package com.example.day23;

public class Employee {
    public int id;
    public String firstName;
    public String lastName;
    public int years;

    public Employee(){
        this.id = 0;
        this.firstName = "";
        this.lastName = "";
        this.years = 0;
    }

    public Employee(int id, String firstName, String lastName, int years){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.years = years;
    }
}
