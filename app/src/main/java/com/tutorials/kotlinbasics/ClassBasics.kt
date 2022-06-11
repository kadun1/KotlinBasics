package com.tutorials.kotlinbasics

fun main() {
    var kadun = Person("Kadun", "Kim", 35)
    kadun.hobby = "play video games"
    kadun.age = 22
    println("kadun is ${kadun.age} years old")
    kadun.stateHobby()
    var john = Person()
    john.hobby = "watch the movies"
    john.stateHobby()
    var johnPeterson = Person(lastName = "Peterson")
    var mobilePhone = MobilePhone("Android","Samsung","Galaxy S20 Ultra")
    mobilePhone.chargeBatter(5)
}

class Person(firstName: String = "John", lastName: String = "Doe"){
    //Member variables - Properties
    var age : Int? = null
    var hobby : String = "watch Netflix"
    var firstName : String? = null

    init {
        this.firstName = firstName
        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName" )
    }
    // Member secondary constructor
    constructor(firstName: String, lastName: String, age: Int)
            : this(firstName, lastName){
        this.age = age
        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName and age $age" )
    }

    //Member functions - Methods
    fun stateHobby() {
        println("$firstName\'s hobby is $hobby")
    }
}

class MobilePhone constructor(osName: String, brand: String, model: String){
    private var battery = 30
    init {
        println("$osName $brand $model")
    }

    fun chargeBatter(charged: Int) {
        println("$battery and ${battery + charged}")
        battery += charged
    }
}
