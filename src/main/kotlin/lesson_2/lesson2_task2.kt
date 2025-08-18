package org.example.lesson_2

fun main() {
    val numberOfPermanentEmployees = 50
    val permanentSalary = 30000
    val numberOfInterns = 30
    val internSalary = 20000

    val permanentExpenses = numberOfPermanentEmployees * permanentSalary
    val totalExpenses = permanentExpenses + numberOfInterns * internSalary
    val averageSalary = totalExpenses / (numberOfPermanentEmployees + numberOfInterns)

    println(permanentExpenses)
    println(totalExpenses)
    println(averageSalary)
}