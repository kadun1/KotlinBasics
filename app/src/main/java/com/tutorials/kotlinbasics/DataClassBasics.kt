package com.tutorials.kotlinbasics

// 주 생성자 1개는 있어야 함, 매개변수는 var, val // 추상, 오픈, 봉인, 내부 클래스일 수 없음
data class User(val id: Long, var name: String)

fun main() {
    val user1 = User(1, "Kadun")

    user1.name = "Michael"
    val user2 = User(1, "Michael")
    println(user1 == user2)

    println("User Details: $user1")

    val updatedUser = user1.copy(name="Denis Panjuta")
    println(user1)
    println(updatedUser)

    println(updatedUser.component1()) // prints 1
    println(updatedUser.component2()) // prints Denis Panjuta

    val (id, name) = updatedUser
    println("id=$id, name=$name")

}