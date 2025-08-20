package org.example.lesson_1

fun main() {
    val year: String = "1961"
    var hours: String = "09"
    var minute: String = "07"

    println("Взлет:")
    println(year)
    println(hours)
    println(minute)

    hours = "10"
    minute = "55"

    println("Посадка: ${hours}:${minute}")
}
