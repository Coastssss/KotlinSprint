package org.example.lesson_5

fun main() {
    val num1 = 7
    val num2 = 3
    val correctAnswer = 10

    println("Для входа в приложение докажите, что вы не бот.")
    println("Решите пример: $num1 + $num2 = ?")

    print("Введите ответ: ")
    val userAnswer = readln().toInt()

    if (userAnswer == correctAnswer) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}