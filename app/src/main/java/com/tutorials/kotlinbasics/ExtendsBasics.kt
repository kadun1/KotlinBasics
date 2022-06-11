package com.tutorials.kotlinbasics

import kotlin.math.ln
import kotlin.math.max

interface Drivable{
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The drivable is braking")
    }
}

// Vehicle의 서브클래스
open class Cars(override val maxSpeed: Double, val name: String, val brand: String) : Drivable{
    open var range : Double = 0.0

    fun extendRage(amount: Double){
        if (amount > 0)
            range += amount
    }

//    override fun drive(): String = "driving the interface drive"
    override fun drive(): String {
        return "driving the interface drive"
    }

    open fun drive(distance: Double){
        println("Drove for $distance KM")
    }
}

class ElectricCars(maxSpeed: Double, name: String, brand: String, batteryLife: Double) : Cars(maxSpeed, name, brand){

    var chargerType = "Type1"
    override var range = batteryLife * 6


    override fun drive(distance: Double) {
        println("Drove for $distance KM on electricity")
    }

    override fun drive() : String{
        return "Drove for $range KM on electricity"
    }

    override fun brake() {
        super.brake()
        println("brake inside of electric car")
    }
}

fun main() {
    var audia3 = Cars(200.0, "A3", "Audi")
    var teslaS = ElectricCars(240.0,"S-Model", "Tesla", 85.0)
    teslaS.chargerType = "Type2"
    teslaS.extendRage(200.0)

//    teslaS.drive()
    teslaS.brake()
    audia3.brake()

    // 다형성
//    audia3.drive(200.0)
//    teslaS.drive(200.0)
}