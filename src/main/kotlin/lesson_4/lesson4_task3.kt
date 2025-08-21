package org.example.lesson_4

fun main() {
    val isSunnyWeather = true
    val isTentOpen = true
    val humidity = 20
    val currentSeason = "зима"

    val isFavorableConditions: Boolean = isSunnyWeather && isTentOpen && humidity == 20 && currentSeason != "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? $isFavorableConditions")
}