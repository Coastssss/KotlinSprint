package org.example.lesson_5

fun main() {
    val winningNumber1 = 17
    val winningNumber2 = 33

    println("Угадайте два числа от 0 до 42 и выиграйте приз!")
    println()

    print("Введите первое число (0-42): ")
    val userNumber1 = readln().toInt()

    print("Введите второе число (0-42): ")
    val userNumber2 = readln().toInt()

    println()

    if (userNumber1 !in 0..42 || userNumber2 !in 0..42) {
        println("Ошибка! Числа должны быть в диапазоне от 0 до 42.")
    }
    else {
        val guessedFirst = (userNumber1 == winningNumber1 || userNumber1 == winningNumber2)
        val guessedSecond = (userNumber2 == winningNumber1 || userNumber2 == winningNumber2)

        if (userNumber1 == userNumber2) println("Ошибка! Числа должны быть разными.")
        else {
            print("РЕЗУЛЬТАТ: ")
            when {
                guessedFirst && guessedSecond -> {
                    println("Поздравляем! Вы выиграли главный приз!")
                }

                guessedFirst || guessedSecond -> {
                    println("Вы выиграли утешительный приз!")
                }

                else -> {
                    println("Неудача!")
                }
            }
            println("Выигрышные числа: $winningNumber1 и $winningNumber2")
            println("Ваши числа: $userNumber1 и $userNumber2")
        }

    }
}