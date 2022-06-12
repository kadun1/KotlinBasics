package com.tutorials.kotlinbasics

fun main() {
    val arrayList = ArrayList<Double>();
    arrayList.add(1.0)
    arrayList.add(5.0)
    arrayList.add(6.0)
    arrayList.add(7.0)
    arrayList.add(12.0)

    var sum: Double = 0.0

    for (i in arrayList) {
        sum += i;
    }

    print(sum/arrayList.size)
    var ex = Example();
    ex.sub()


}

class Example{

    fun sub() {
        val i: String = "1"
        var str: Int? = i as? Int
        var re = str ?: "d"
        print(re)
    }
}