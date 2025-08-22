package org.example.lesson_4

fun main() {
    val trainingDay = 5
    val isEvenDay = (trainingDay % 2) == 0

    println("Упражнения для рук:    ${!isEvenDay}\n" +
            "Упражнения для ног:    $isEvenDay\n" +
            "Упражнения для спины:  $isEvenDay\n" +
            "Упражнения для пресса: ${!isEvenDay}")
}