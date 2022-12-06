/**
 * Given a string S consisting of N, lower case English alphabet, it is also given that a string is encrypted by first replacing every substring of the string consisting of the same character with the concatenation of that character and the hexadecimal representation of the size of the substring and then revering the whole string, the task is to find the encrypted string.
 *
 * Note: All Hexadecimal letters should be converted to Lowercase letters.
 *
 * Examples:
 *
 * Input: S = “aaaaaaaaaaa”
 * Output: ba
 * Explanation:
 *
 * First convert the given string to “a11” i.e. write, character along with its frequency.
 * Then, change “a11” to “ab” because 11 is b in hexadecimal.
 * Then, finally reverse the string i.e “ba”.
 * Input: S = “abc”
 * Output: 1c1b1a
 */

/**
 * Approach: The problem can be solved by iterating over the characters of the string S. Follow the steps below to solve this problem:
 *
 * Initialize an empty string say, ans to store the answer.
 * Iterate over the characters of the string S, using the variable i, and perform the following steps:
 * Find the count of a substring with the same character, S[i], starting from index i and store it in a variable, say, count.
 * Now convert the count to hexadecimal representation, and append the character S[i] along with its frequencies hexadecimal representation.
 * Finally, reverse the string ans and then print it.
 */

fun convertToHex(num: Int): String? {
    var num = num
    val temp = StringBuilder()
    while (num != 0) {
        val rem = num % 16
        var c: Char
        c = if (rem < 10) {
            (rem + 48).toChar()
        } else {
            (rem + 87).toChar()
        }
        temp.append(c)
        num = num / 16
    }
    return temp.toString()
}

fun encryptString(S: String, N: Int): String? {
    val ans = StringBuilder()

    // Iterate the characters
    // of the string
    var i = 0
    while (i < N) {
        val ch = S[i]
        var count = 0
        var hex: String?

        // Iterate until S[i] is equal to ch
        while (i < N && S[i] == ch) {
            // Update count and i
            count++
            i++
        }

        // Decrement i by 1
        i--

        // Convert count to hexadecimal
        // representation
        hex = convertToHex(count)

        // Append the character
        ans.append(ch)

        // Append the characters frequency
        // in hexadecimal representation
        ans.append(hex)
        i++
    }

    // Reverse the obtained answer
    ans.reverse()

    // Return required answer
    return ans.toString()
}

fun main(){
    val S = "abc"
    val N = S.length
    // Function Call
    println(encryptString(S, N))
}