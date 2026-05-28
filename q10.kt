/**
 * Question 10: Check whether a character is a vowel or consonant using a function.
 */
fun main() {
    val ch = 'e'
    checkCharacterType(ch)
}

// Function to check and print character type
fun checkCharacterType(ch: Char) {
    val lowerCh = ch.lowercaseChar()

    if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
        println("'$ch' is a Vowel.")
    } else if (lowerCh in 'a'..'z') {
        println("'$ch' is a Consonant.")
    } else {
        println("'$ch' is not a valid alphabetic character.")
    }
}
