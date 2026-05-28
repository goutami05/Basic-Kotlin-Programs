/**
 * Question 12: Swap two numbers using a third variable & without using a third variable.
 */
fun main() {
    // 1. Using a third variable
    var a = 10
    var b = 40
    println("--- Using Third Variable ---")
    println("Before Swap: a = $a, b = $b")
    
    val temp = a
    a = b
    b = temp
    println("After Swap: a = $a, b = $b\n")

    // 2. Without using a third variable
    var x = 50
    var y = 100
    println("--- Without Third Variable ---")
    println("Before Swap: x = $x, y = $y")
    
    x = x + y  // x now becomes 1
    y = x - y  // y becomes 150 - 100 = 50
    x = x - y  // x becomes 150 - 50 = 100
    println("After Swap: x = $x, y = $y")
}
