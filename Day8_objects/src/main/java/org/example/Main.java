package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sample1();
    }

    public static void sample2(){
        Scanner sc = new Scanner(System.in);
        Book b = addBook();
        b.print();

        Book b2 = addBook();
        b2.print();
    }

    public static Book addBook(){
        Scanner sc = new Scanner(System.in);

        Book b = new Book();
        System.out.println("Ievadiet autora vārdu!");
        b.authorName = sc.nextLine();
        System.out.println("Ievadiet grāmatas nosaukumu!");
        b.bookName = sc.nextLine();
        System.out.println("Izdošanas gads:");
        b.year = sc.nextInt();

        return b;
    }

    public static void sample1(){
        Student st = new Student("Jānis", "Bērziņš", 1);
        st.print();

        Student st2 = new Student("Juris", "Kļava", 1);
        st2.print();

        List<Student> studentLst = new ArrayList<>();
        studentLst.add(st);
        studentLst.add(st2);

        studentLst.add(new Student("Anna", "Vītola", 2));

        studentLst.get(0).lastName = "aaa";

        for(int i = 0; i < studentLst.size(); i++){
            System.out.println(studentLst.get(i).lastName);
            studentLst.get(i).print();
        }

        for(var s : studentLst){
           s.print();
        }
    }
}