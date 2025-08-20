package org.example.lesson_2

/* Сайт с расписанием поездов получает данные с сервера. Сервер посылает время выезда и время в пути,
 а время прибытия вычисляется из них. Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.

– Создай целочисленные переменные и проинициализируй их этими данными;
– Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
– Выведи результат в консоль. */

const val MINUTE_IN_HOUR = 60

fun main() {
    val checkoutHours: Int = 9
    val checkoutMinutes: Int = 39
    val travelTimeMinutes: Int = 457


    val pathInHours: Int = travelTimeMinutes / MINUTE_IN_HOUR
    val pathInMinutes: Int = travelTimeMinutes % MINUTE_IN_HOUR
    val totalMinutes: Int = (checkoutMinutes + pathInMinutes) % MINUTE_IN_HOUR
    val totalHours: Int = checkoutHours + pathInHours + ((checkoutMinutes + pathInMinutes) / MINUTE_IN_HOUR)

    println("Время прибытия: %02d:%02d".format(totalHours, totalMinutes))
