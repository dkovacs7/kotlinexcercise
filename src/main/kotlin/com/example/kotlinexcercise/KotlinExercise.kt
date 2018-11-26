package com.example.kotlinexcercise

import java.util.*


fun main(args: Array<String>) {

    val john = KotlinPerson(1L, "Mr", "John", "Blue", GregorianCalendar(1977,9,3) )
    val jane = KotlinPerson(2L, "Mrs", "Jane", "Green", null)

    println("$john's age is ${john.age}")
    println("$jane's age is ${jane.age}")
    println("The age of someone born on 3rd May 1988 is ${KotlinPerson.getAge(GregorianCalendar(1988,5,3))}")

    //val dave = KotlinPerson(2L, null, "Jane", "Green", null)

}