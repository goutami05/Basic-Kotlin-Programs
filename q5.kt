/**
 * Question 5: Check whether a number is a palindrome or not.
 */
fun main() {
    val number = 121 
    var temp = number
    var reversedNumber = 0

    // Reverse the number first
    while (temp != 0) {
        val digit = temp % 10
        reversedNumber = reversedNumber * 10 + digit
        temp /= 10
    }
    if (number == reversedNumber) {
        println("$number is a Palindrome.")
    } else {
        println("$number is NOT a Palindrome.")
    }
}
