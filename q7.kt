/**
 * Question 7: Find the largest among three numbers using a function.
 */
fun main() {
    val num1 = 70
    val num2 = 893
    val num3 = 12
    
    val largest = findLargest(num1, num2, num3)
    println("The largest number among $num1, $num2, and $num3 is: $largest")
}

// Function that returns the maximum of three integers
fun findLargest(a: Int, b: Int, c: Int): Int {
    return if (a >= b && a >= c) {
        a
    } else if (b >= a && b >= c) {
        b
    } else {
        c
    }
}
