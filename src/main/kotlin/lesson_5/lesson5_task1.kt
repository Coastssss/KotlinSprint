package org.example.lesson_5
import kotlin.random.Random

fun main() {
    val num1 = Random.nextInt(1, 50)
    val num2 = Random.nextInt(1, 50)
    val correctAnswer = num1 + num2

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