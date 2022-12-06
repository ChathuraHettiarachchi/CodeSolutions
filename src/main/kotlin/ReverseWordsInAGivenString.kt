/**
 * Given a string, the task is to reverse the order of the words in the given string.
 *
 * Examples:
 *
 * Input: s = “geeks quiz practice code”
 * Output: s = “code practice quiz geeks”
 *
 * Input: s = “i love programming very much”
 * Output: s = “much very programming love i”
 */
fun main() {
    val str = "i love programming very much"
    println(reverseOrder(str))
}

fun reverseOrder(s: String): String {
    val words = s.split(" ").reversed()
    var output = ""
    words.forEach{
        output += " $it"
    }

    return output.trim()
}