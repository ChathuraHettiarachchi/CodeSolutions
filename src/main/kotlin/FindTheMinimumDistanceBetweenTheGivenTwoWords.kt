/**
 * Given a list of words followed by two words, the task is to find the minimum distance between the given two words in the list of words.
 *
 * Examples:
 *
 * Input: S = { “the”, “quick”, “brown”, “fox”, “quick”}, word1 = “the”, word2 = “fox”
 * Output: 3
 * Explanation: Minimum distance between the words “the” and “fox” is 3
 *
 * Input: S = {“geeks”, “for”, “geeks”, “contribute”,  “practice”}, word1 = “geeks”, word2 = “practice”
 * Output: 2
 * Explanation: Minimum distance between the words “geeks” and “practice” is 2
 */

fun main() {
    val S = arrayOf("the", "quick", "brown", "fox", "quick")
    val word1 = "the"
    val word2 = "fox"

    // Function Call
    println(shortestDistance(S, word1, word2))
}

fun shortestDistance(s: Array<String>, word1: String, word2: String): Int {
    var d1 = -1
    var d2 = -1
    var ans = Int.MAX_VALUE

    // Traverse the string
    for (i in s.indices) {
        if (s[i] === word1) d1 = i
        if (s[i] === word2) d2 = i
        if (d1 != -1 && d2 != -1) ans = Math.min(ans, Math.abs(d1 - d2))
    }

    // Return the answer
    return ans
}