/**
 * Question 8: Count the number of digits in a given integer.
 */
fun main() {
    var number = 98765475356
    val original = number
    var count = 0
    if (number == 0) {
        count = 1
    } else {
        while (number != 0) {
            number /= 10
            count++
        }
    }

    println("The number of digits in $original is: $count")
}
