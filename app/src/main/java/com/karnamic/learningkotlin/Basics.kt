package com.karnamic.learningkotlin

object Basics {

    const val ADD: String = "+"
    const val SUB: String = "-"
    const val MUL: String = "x"
    const val DIV: String = "/"

    fun calculate(operation: String, num1: Int, num2 : Int): Int {
        return when (operation) {
            ADD -> num1 + num2
            SUB -> num1 - num2
            MUL -> num1 * num2
            DIV -> num1 / num2
            else -> throw Exception("Invalid operation")
        }
    }
}