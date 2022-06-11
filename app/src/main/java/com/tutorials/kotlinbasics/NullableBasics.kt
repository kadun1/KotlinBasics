package com.tutorials.kotlinbasics

fun main() {

//    var name: String = "Dsnis"
//    name = null -> Compilation ERROR
    var nullableName : String? = "Denis"
//    nullableName = null


    var len2 = nullableName?.length
    nullableName?.let { println(it.length) }

    // ?: Elvis operator
    val name = nullableName?: "Guest"
    println("name is $name")

    println(nullableName!!.toLowerCase())

    // You can ferform a chain safe calls:
    // val wifesAge: String? = user?.wife?.age ?: 0

    /*
    if (nullableName != null) {
        var len2 = nullableName.length
    } else {
        null
    }
    */
}