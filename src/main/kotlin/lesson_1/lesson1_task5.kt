package org.example.lesson_1

fun main() {
    var seconds = 6480
    val minutes = (seconds % 3600) / 60
    val hour = seconds / 3600

    seconds = seconds - hour*3600 - minutes*60
    println("Время полета: %02d:%02d:%02d".format(hour,minutes,seconds))
}