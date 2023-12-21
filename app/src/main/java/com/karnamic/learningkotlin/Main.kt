package com.karnamic.learningkotlin

fun main() {

    val testArray = intArrayOf(3,4,5,6,7,3)

    testArray.forEach {
        print("$it ")
    }
    println(ArraysHashing.containsDuplicate(testArray))

}

