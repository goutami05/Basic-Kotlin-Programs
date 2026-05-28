/**
 * Question 14: Print all prime numbers from 1 to N.
 */
fun main() {
    val n = 30
    println("Prime numbers between 1 and $n are:")
    
    for (i in 2..n) {
        if (isPrime(i)) {
            print("$i ")
        }
    }
    println()
}
fun isPrime(num: Int): Boolean {
    if (num <= 1) return false
    for (i in 2..num / 2) {
        if (num % i == 0) return false
    }
    return true
}
