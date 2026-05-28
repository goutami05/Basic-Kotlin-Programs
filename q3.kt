/**
 * Question 3: Find the sum of all numbers from 1 to N using a function.
 */
fun main() {
    val n = 50
    val result = findSum(n)
    println("The sum of numbers from 1 to $n is: $result")
}

// Function to find the sum of numbers from 1 to n
fun findSum(n: Int): Int {
    var sum = 0
    for (i in 1..n) {
        sum += i
    }
    return sum
}
