/**
 * Question 13: Calculate simple interest using a function.
 */
fun main() {
    val principal = 5000.0
    val rate = 7.5
    val time = 3.0 // in years

    val interest = calculateSimpleInterest(principal, rate, time)
    println("Principal: ₹$principal")
    println("Rate of Interest: $rate%")
    println("Time Period: $time years")
    println("Calculated Simple Interest: ₹$interest")
}

// Function to calculate simple interest: (P * R * T) / 100
fun calculateSimpleInterest(p: Double, r: Double, t: Double): Double {
    return (p * r * t) / 100
}
