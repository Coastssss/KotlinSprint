package org.example.lesson_5

const val AGE_OF_MAJORITY = 18

fun main() {
    val thisYear = 2025
    print("Добро пожаловать! Пожалуйста, введите свой год рождения: ")
    val userYear = readln().toInt()
    val userAge = thisYear - userYear

    if (userAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Вернуться на главный экран приложения")
    }
}