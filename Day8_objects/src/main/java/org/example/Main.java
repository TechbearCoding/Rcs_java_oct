package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student st = new Student();
        st.name = "Jānis";
        st.lastName = "Bērziņš";
        st.course = 1;

        st.print();

        Student st2 = new Student();
        st2.name = "Juris";
        st2.lastName = "Kļava";
        st2.course = 1;
        st2.print();

        //Scanner sc = new Scanner(System.in);

    }
}