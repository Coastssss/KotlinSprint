package org.example.lesson_1

const val SECONDS_IN_MINUTE = 60
const val SECONDS_IN_HOUR = 3600

fun main() {
    var seconds = 6480
    val minutes = (seconds % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE
    val hours = seconds / SECONDS_IN_HOUR

    seconds = seconds - hours * SECONDS_IN_HOUR - minutes * SECONDS_IN_MINUTE
    println("Время полета: %02d:%02d:%02d".format(hours, minutes, seconds))
}