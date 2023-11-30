package org.example;

public class Book {
    public String authorName;
    public String bookName;
    public int year;

    public Book(){
        this.authorName = "";
        this.bookName = "";
        this.year = 0;
    }
    public Book(String authorName, String bookName, int year){
        this.authorName = authorName;
        this.bookName = bookName;
        this.year = year;
    }

    public void print(){
        System.out.println(authorName);
        System.out.println(bookName);
        System.out.println(year);
        System.out.println("---------------");
    }

}
