package org.example.lesson_2

fun main() {
    val numberOfStudents = 4
    val studentScore1 = 3
    val studentScore2 = 4
    val studentScore3 = 5
    val studentScore4 = 3
    val averageScoreClass: Double =
        (studentScore1 + studentScore2 + studentScore3 + studentScore4).toDouble() / numberOfStudents

    println("Средний балл класса: %.2f".format(averageScoreClass))
}