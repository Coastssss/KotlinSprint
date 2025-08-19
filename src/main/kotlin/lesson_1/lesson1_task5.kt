package org.example.lesson_1

fun main() {
    val secondsInMinute = 60
    val secondsInHour = 3600
    var seconds = 6480
    val minutes = (seconds % secondsInHour) / secondsInMinute
    val hours = seconds / secondsInHour

    seconds = seconds - hours * secondsInHour - minutes * secondsInMinute
    println("Время полета: %02d:%02d:%02d".format(hours, minutes, seconds))
}