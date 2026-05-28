/**
 * Question 9: Print the multiplication table of a given number.
 */
fun main() {
    val number = 7
    println("Multiplication Table of $number:")
    
    // Loop from 1 to 10 to print standard table rows
    for (i in 1..10) {
        println("$number x $i = ${number * i}")
    }
}
