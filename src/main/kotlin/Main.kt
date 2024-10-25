package me.astrozdenek

fun main() {
    println("Do you want to calculate Kelvin (type \"K\") or Celsius (type \"C\")?")

    val whatDoWeWantToCalculate = readln()

    if (whatDoWeWantToCalculate == "K" || whatDoWeWantToCalculate == "k") {
        println("Enter temperature in ℃:")

        val tempInCelsius = readln().toDouble() // Converting into Double
        val result = 273.15 + tempInCelsius

        println("Temperature is: $result K")
    } else if (whatDoWeWantToCalculate == "C" || whatDoWeWantToCalculate == "c") {
        println("Enter temperature in K:")

        val tempInKelvin = readln().toDouble() // Converting into Double
        val result = tempInKelvin - 273.15

        println("Temperature is: $result ℃")
    } else {
        println("Invalid input.")
    }
}