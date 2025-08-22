package org.example.lesson_4

const val REQUIRED_HUMIDITY = 20
const val PROHIBITED_SEASON = "зима"
fun main() {
    val isSunnyWeather = true
    val isTentOpen = true
    val humidity = 20
    val currentSeason = "зима"

    val isFavorableConditions: Boolean = isSunnyWeather && isTentOpen && humidity == REQUIRED_HUMIDITY && currentSeason != PROHIBITED_SEASON

    println("Благоприятные ли условия сейчас для роста бобовых? $isFavorableConditions")
}