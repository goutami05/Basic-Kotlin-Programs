/**
 * Question 6: Find the factorial of a number using a loop.
 */
fun main() {
    val number = 5
    var factorial: Long = 1 

    // Loop from 1 up to the number to calculate product
    for (i in 1..number) {
        factorial *= i
    }

    println("The factorial of $number is: $factorial")
}
