package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Student> lst = new ArrayList<>();
        lst.add(new Student("test", "test2", 1));
        lst.add(new Student("test2", "test2", 2));

        List<Student> lst2 = getStudentLst(-2);
        printStudentList(lst2);
    }

    private static List<Student> getStudentLst(int a){
        if(a < 1){
            System.out.println("Kļūda!");
            a = 1;
        }
        List<Student> lst = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < a; i++){
            System.out.println("Ievadiet studenta vārdu!");
            String name = sc.nextLine();
            System.out.println("Ievadiet studenta uzvārdu!");
            String lastName = sc.nextLine();
            System.out.println("Ievadiet kursu!");
            int course;
            try{
                course = sc.nextInt();
            }catch(Exception e){
                System.out.println("Kļūda!");
                course = 1;
            }

            sc.nextLine();
            lst.add(new Student(name, lastName, course));
        }
        return lst;
    }

    private static void printStudentList(List<Student> lst){
        if(lst.isEmpty()){
            System.out.println("Saraksts ir tukšs!");
        }
        for(var st : lst){
            st.print();
        }
    }

    private static void task2() {
        List<Book> bookList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.println("Ievadiet autora vārdu!");
            String name = sc.nextLine();
            System.out.println("Ievadiet grāmatas nosaukumu!");
            String bookName = sc.nextLine();
            System.out.println("Izdošanas gads:");
            int year = sc.nextInt();
            bookList.add(new Book(name, bookName, year));
        }

        for(int i = 0; i < 5; i++){
            bookList.add(addBook());
        }

        for(int i = 0; i < bookList.size(); i++){
            bookList.get(i).print();
        }
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

        for(int i = 0; i < studentLst.size(); i++){
            System.out.println(studentLst.get(i).lastName);
            studentLst.get(i).print();
        }

//        for(Student s : studentLst){
//           s.print();
//        }
    }
}