package org.example.lesson_4

const val NUMBER_OF_TABLES = 13

fun main() {
    val bookingToday = 13
    val bookingTomorrow = 9

    println(
        "Доступность столиков на сегодня: ${bookingToday < NUMBER_OF_TABLES}\n" +
                "Доступность столиков на завтра: ${bookingTomorrow < NUMBER_OF_TABLES}"
    )


}