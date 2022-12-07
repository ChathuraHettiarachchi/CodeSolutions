/**
 * Given a string Str. The task is to check if it is Pangram or not.
 *
 * A pangram is a sentence containing every letter in the English Alphabet.
 *
 * Examples:
 *
 * Input: “The quick brown fox jumps over the lazy dog”
 * Output: is a Pangram
 * Explanation: Contains all the characters from ‘a’ to ‘z’]
 */

fun checkPangram(str: String): Boolean {
    if(str.length < 26)
        return false

    val chars = ('a'..'z').toList()
    var count = 0

    chars.toCharArray().forEach {
        if(str.contains(it))
            count++
    }

    return count == chars.size
}

fun main() {
    val str = "The quick brown fox jumps over the lazy dog"
    if (checkPangram(str) == true) print("$str \nis a pangram.") else print("$str \nis not a pangram.")
}