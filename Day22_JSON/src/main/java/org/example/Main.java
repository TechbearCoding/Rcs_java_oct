package org.example;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String name = "Janis";
        String lastName = "Berzins";
        int years = 3;

        Employee e = new Employee(name, lastName, years);

        Gson g = new Gson();
        String json = g.toJson(e);

        //System.out.println(json);

        Employee e2 = g.fromJson(json, Employee.class);
        //System.out.println(e2.firstName);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e);
        employeeList.add(e2);
        employeeList.add(new Employee("Juris", "Klava", 1));

        String json2 = g.toJson(employeeList);
        System.out.println(json2);

        List<Employee> lst2 = Arrays.asList(g.fromJson(json2, Employee[].class));
        System.out.println(lst2.get(2).firstName);
    }
}