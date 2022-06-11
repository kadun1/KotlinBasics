package com.tutorials.kotlinbasics

fun main() {
    // immutable variable
    // TODO: Add new functionality
    /*
    This
    is a multiline
    comment
     */


    // type string
    val myName = "Kadun~!"
    // type int
    var myAge = 31

    // Integer TYPES: Byte (8 bit), Short (16 Bit),
    // Int (32 bit), Long (64 bit)
    val myByte: Byte = 127
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 39_812_309_487_120_300

    // Floating Point number Types: Float (32 bit), Double (64 bit)
    val myFloat: Float = 13.37F
    val myDouble: Double = 3.14159123412341234

    // Booleans he types Boolean is used to represent logical values.
    // It can have two possible values ture and false.
    var isSunny: Boolean = true
    isSunny = false

    // Characters
    val letterChar = 'A'
    val digitChar = '1'

    // Strings
    val myStr = "Hello World"
    var firstCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]

//    println("First Character $firstCharInStr and the length of myStr is ${myStr.length}")
//    print("Last Character $lastCharInStr")

    //Arithmetic operators (+, -, *, /, %)
    var result = 5 + 3
    val a = 5.0
    val b = 3
    var resultDouble: Double
    resultDouble = a / b
//    print(resultDouble)

    // Comparison operators (==, !=, <, >, <=, >=)
    val isEqual = 5 == 3
//    print("isEquals is $isEqual")

    val isNotEqual = 5 != 5
//    println("isNotEqual is $isNotEqual")
//    println("is-5less3 ${-5 < 3}")
//    println("is5LowerEqual3 ${5 <= 3}")
//    println("is5GreaterEqual3 ${5 >= 5}")

    //Assignment operators (+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 3
    myNum *= 4
//    println("myNum is $myNum")

    //Increment & Decrement operators (++,--)
    myNum++
//    println("myNum is $myNum")
//    println("myNum is ${myNum++}")
//    println("myNum is ${++myNum}")
//    println("myNum is ${--myNum}")

    var heightPerson1 = 170
    var heightPerson2 = 189

//    if (heightPerson1 > heightPerson2) {
//        println("use raw force")
//    } else if (heightPerson1 == heightPerson2) {
//        println("use your power technique 1337")
//    } else {
//        println("use technique")
//    }

    val age = 31
//    if (age >= 21) {
//        println("now you may drink in the US")
//    } else if (age >= 18) {
//        println("you may vote now")
//    } else if (age >= 16) {
//        println("you may drive now")
//    } else {
//        println("you're too young")
//    }

    var name = "Denis"

//    if (name == "Denis") {
//        println("welcome home denis")
//    } else {
//        println("who are you?")
//    }

    var season = 3
    when (season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }

    var month = 3
    when (month) {
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12, 1, 2 -> println("Winter")
        else -> println("Invalid Season")
    }

    when (age) {
        in 21..150 -> println("now you may drink in the US")
        in 18..20 -> println("you may vote now")
        in 16..17 -> println("you may drive now")
        else -> println("you're too young")
    }

//    var x: Any = "13.17f"
//    when (x) {
//        is Int -> println("$x is and Int")
//        !is Double -> println("$x is not a Double")
//        is String -> println("$x is and String")
//        else -> println("$x is none for the above")
//    }

    var x = 1
    while (x <= 10) {
        print("$x")
        x++
    }
    println("\nwhile loop is done")

    var y = 100
    while (y >= 0) {
        print("$y")
        y -= 2
    }
    println("\nwhile loop is done")

    x = 15
    do{
        print("$x")
        x++
    }while (x <= 10)
    println("\nwhile loop is done")

    var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp == "cold") {
        roomTemp++
        if (roomTemp >= 20) {
            feltTemp = "comfy"
            println("it's comfy now")
        }
    }

//    for (num in 1..10) {
//        print("$num")
//    }

    for (i in 1 until 10) { // Same as - for(i in 1.until(10))
        print("$i ")
    }
    println("")

    for (i in 10 downTo 1 step 2) { // Same as - for(i in 10.downTo(10).step(2))
        print("$i ")
    }

    println("-------")
    for (i in 0..10000) {
        if (i == 9001) {
            print("IT'S OVER 9000!!!")
        }
    }

    var humidity = "humid"
    var humidityLevel = 80
    while (humidity=="humid") {
        humidityLevel -= 5
        print("humidity decreased\n")
        if (humidityLevel < 60) {
            humidity == "comfy"
            print("it's comfy now")
            break
        }
    }



}

fun hello() {

}