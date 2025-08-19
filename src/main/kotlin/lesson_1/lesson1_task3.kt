package org.example.lesson_1

fun main() {
    val year: Int = 1961
    var hours: Int = 9
    var minute: Int = 7

    println("Взлет:")
    println(year)
    println(hours)
    println(minute)

    hours = 10
    minute = 55

    println("Посадка: %02d:%02d".format(hours, minute))
}
