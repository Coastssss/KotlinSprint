package org.example.lesson_1

fun main()
{
    val numberOfOrders: Int = 75
    val thanksMessage: String = "Благодарим вас за покупку!"
    var numberOfEmployees: Int = 2000

    println("Количество заказов: $numberOfOrders")
    println(thanksMessage)

    //println("Количество работников: $numberOfEmployees")
    numberOfEmployees--
    println("Количество работников: $numberOfEmployees")
}