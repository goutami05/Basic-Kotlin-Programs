/**
 * Question 16: Convert temperature: Celsius to Fahrenheit & Fahrenheit to Celsius.
 */
fun main() {
    val celsiusValue = 37.0
    val fahrenheitValue = 98.6

    // Conversion formulas:
    // F = (C * 9/5) + 32
    // C = (F - 32) * 5/9

    val cToF = (celsiusValue * 9 / 5) + 32
    val fToC = (fahrenheitValue - 32) * 5 / 9

    println("$celsiusValue°C is equal to $cToF°F")
    println("$fahrenheitValue°F is equal to $fToC°C")
}
