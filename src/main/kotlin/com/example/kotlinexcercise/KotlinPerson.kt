package com.example.kotlinexcercise

import java.util.*


data class KotlinPerson(val id: Long?, val title: String?, val firstName: String?, val surname: String?, val dateOfBirth: Calendar?) {

    init {
        if (id == null || title == null || firstName == null || surname == null)
            throw NullPointerException()
    }

    fun getAge(): Int {
        return getAge(dateOfBirth)
    }


    override fun toString() = "$title $firstName $surname"


    companion object {
        fun getAge(dateOfBirth: Calendar?): Int {
            if (dateOfBirth == null) return -1

            val today = GregorianCalendar()
            val years = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR)

            return if (dateOfBirth.get(Calendar.DAY_OF_YEAR) >= today.get(Calendar.YEAR)) years - 1 else years
        }
    }

}



