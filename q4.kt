/**
 * Question 4: Reverse a given number using loops.
 */
fun main() {
    var number = 6578
    val originalNumber = number
    var reversedNumber = 0

    // Loop to reverse the number
    while (number != 0) {
        val digit = number % 10
        reversedNumber = reversedNumber * 10 + digit
        number /= 10
    }

    println("Original Number: $originalNumber")
    println("Reversed Number: $reversedNumber")
}
