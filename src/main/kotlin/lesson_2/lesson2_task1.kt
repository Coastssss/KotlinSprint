package org.example.lesson_2

fun main() {
    val sr1 = 3
    val sr2 = 4
    val sr3 = 5
    val sr4 = 3
    val srAr: Double = (sr1+sr2+sr3+sr4).toDouble() / 4

    println("%.2f".format(srAr))
}