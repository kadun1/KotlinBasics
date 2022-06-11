package com.tutorials.kotlinbasics

var b =3
fun main() {
    myFunction(5)
    b = 5
}

// this a is a parameter
fun myFunction(a: Int) {
    // a is a variable
    b = a
    println("a is $b")
}