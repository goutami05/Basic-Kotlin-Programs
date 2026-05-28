/**
 * Question 11: Find the sum of digits of a number.
 */
fun main() {
    var number = 5432
    val original = number
    var sum = 0

    // Extract digits and add them
    while (number != 0) {
        val digit = number % 10
        sum += digit
        number /= 10
    }

    println("The sum of the digits of $original is: $sum")
}
