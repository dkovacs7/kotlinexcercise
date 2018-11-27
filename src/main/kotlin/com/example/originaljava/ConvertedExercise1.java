package com.example.originaljava;

import java.util.GregorianCalendar;

public class ConvertedExercise1 {

    public static void main(String[] Args) {
        ConvertedJavaPerson john = new ConvertedJavaPerson(1L, "Mr", "John", "Blue", new GregorianCalendar(1977,9,3));
        ConvertedJavaPerson jane = new ConvertedJavaPerson(2L, "Mrs", "Jane", "Green", null);
        System.out.println (john + "'s age is " + john.getAge());
        System.out.println (jane + "'s age is " + jane.getAge());
        System.out.println ("The age of someone born on 3rd May 1988 is " + ConvertedJavaPerson.Companion.getAge(new GregorianCalendar(1988,5,3)));

    }

}
