package com.tutorials.kotlinbasics

fun main() {

    val months = listOf("January", "February", "March")
    val anyTypes = listOf(1,2,3,true,false,"String")
//    print(anyTypes.size)
//    print(months[1])

    val additionalMonths = months.toMutableList()
    val newMonths = arrayOf("April", "May", "June")
    additionalMonths.addAll(newMonths)
    additionalMonths.add("July")
//    print(additionalMonths)

    val days = mutableListOf<String>("Mon", "Tue", "Wed")
    days.add("Thu")
    days[2] = "Sunday"
//    days.removeAt(1)
    val removeList = mutableListOf<String>("Mon", "Wed")
//    days.removeAll(removeList)
    days.removeAll(days)

    print(days)
}