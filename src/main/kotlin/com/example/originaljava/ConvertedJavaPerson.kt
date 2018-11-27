package com.example.originaljava

import java.util.Calendar
import java.util.GregorianCalendar
import java.util.Objects

class ConvertedJavaPerson(val id: Long?, val title: String?, val firstName: String?, val surname: String?, val dateOfBirth: Calendar?) {

    val age: Int
        get() = getAge(dateOfBirth)

    init {
        if (id == null || title == null || firstName == null || surname == null)
            throw NullPointerException()
    }

    override fun toString(): String {
        return "$title $firstName $surname"
    }

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false
        val that = o as ConvertedJavaPerson?
        return id == that!!.id &&
                title == that.title &&
                firstName == that.firstName &&
                surname == that.surname
    }

    override fun hashCode(): Int {

        return Objects.hash(id, title, firstName, surname)
    }

    companion object {

        fun getAge(dateOfBirth: Calendar?): Int {
            if (dateOfBirth == null) return -1

            val today = GregorianCalendar()
            val years = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR)
            return if (dateOfBirth.get(Calendar.DAY_OF_YEAR) >= today.get(Calendar.YEAR)) {
                years - 1
            } else {
                years
            }

        }
    }
}
