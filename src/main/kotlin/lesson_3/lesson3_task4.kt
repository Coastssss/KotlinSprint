package org.example.lesson_3

fun main() {
    var fromPlace = "E2"
    var toPlace = "E4"
    var moveNumber = 1

    val moveString = "[Ход: $fromPlace-$toPlace ; Номер хода: $moveNumber]"
    println(moveString)

    fromPlace = "D2"
    toPlace = "D3"
    moveNumber++

    val secondMoveString = "[Ход: $fromPlace-$toPlace ; Номер хода: $moveNumber]"
    println(secondMoveString)
}