package com.tutorials.kotlinbasics

fun main() {

    val fruits = setOf("Orange", "Apple","Mango" ,"Grape", "Apple", "Orange")
//    print(fruits.toSortedSet())

    val newFruit = fruits.toMutableList()
    newFruit.add("Water Melon")
    newFruit.add("Pear")
//    print(newFruit.elementAt(4))

    val daysOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")
//    print(daysOfTheWeek[2])

    for (key in daysOfTheWeek.keys) {
//        print("$key is to ${daysOfTheWeek[key]}")
    }

    val fruitsMap = mapOf("Favorite" to Fruits("Grape", 2.5), "OK" to Fruits("Apple", 1.0))

    val newDaysOfWeek = daysOfTheWeek.toMutableMap()
    newDaysOfWeek[4] = "Thursday"
    newDaysOfWeek[5] = "Friday"

    println(newDaysOfWeek.toSortedMap())


}

data class Fruits(val name: String, val price: Double)