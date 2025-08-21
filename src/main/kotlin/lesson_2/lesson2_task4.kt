package org.example.lesson_2

fun main() {
    val buffPercent = 20
    val buff: Double = buffPercent / 100.0
    val crystalWithoutBuff = 7
    val ironWithoutBuff = 11

    val crystalBonus = (crystalWithoutBuff * buff).toInt()
    val ironBonus = (ironWithoutBuff * buff).toInt()

    println("Кристаллическая руда: $crystalBonus")
    println("Железная руда: $ironBonus")
}