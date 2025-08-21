package org.example.lesson_3

fun main() {
    var lastName: String = "Андреева"
    val firstName: String = "Татьяна"
    val middleName: String = "Сергеевна"
    var age: Int = 20

    println("ФИО: $lastName $firstName $middleName, возраст: $age")
    age = 22
    lastName = "Сидорова"
    println("ФИО: $lastName $firstName $middleName, возраст: $age")
}