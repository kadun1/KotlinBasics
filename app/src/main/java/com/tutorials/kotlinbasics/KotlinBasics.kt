package com.tutorials.kotlinbasics

fun main() {
    // argument
    var result = addUp(5,3)
    var avg = avg(5.3, 13.37)
    print("result is $result")
    print("result is $avg")
}

fun avg(a: Double, b: Double) : Double {

    return (a+b)/2
}

// Method - a Method is a Function within a class
// Parameter (input)
fun addUp(a: Int, b: Int) : Int {
    //output
    return a+b
}

fun myFunction() {
    print("Called from myFunction")
}