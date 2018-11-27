package com.example.originaljava;

import java.util.GregorianCalendar;

public class OriginalExercise1 {

    public static void main(String[] Args) {
        OriginalJavaPerson john = new OriginalJavaPerson(1L, "Mr", "John", "Blue", new GregorianCalendar(1977,9,3));
        OriginalJavaPerson jane = new OriginalJavaPerson(2L, "Mrs", "Jane", "Green", null);
        System.out.println (john + "'s age is " + john.getAge());
        System.out.println (jane + "'s age is " + jane.getAge());
        System.out.println ("The age of someone born on 3rd May 1988 is " + OriginalJavaPerson.getAge(new GregorianCalendar(1988,5,3)));

    }

}
