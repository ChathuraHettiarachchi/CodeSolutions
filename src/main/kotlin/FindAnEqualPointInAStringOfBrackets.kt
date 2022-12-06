/**
 * Given a string of brackets, the task is to find an index k which decides the number of opening brackets is equal to the number of closing brackets.
 * The string must be consists of only opening and closing brackets i.e. ‘(‘ and ‘)’.
 *
 * An equal point is an index such that the number of opening brackets before it is equal to the number of closing brackets from and after.
 *
 * Examples:
 *
 * Input: str = “(())))(“
 * Output:   4
 * Explanation: After index 4, string splits into (()) and ))(. The number of opening brackets in the first part is equal to the number of closing brackets in the second part.
 *
 * Input: str = “))”
 * Output: 2
 * Explanation: As after 2nd position i.e. )) and “empty” string will be split into these two parts. So, in this number of opening brackets i.e. 0 in the first part is equal to the number of closing brackets in the second part i.e. also 0.
 */

fun findIndex(str: String): Int {
    val len = str.length
    var cnt_close = 0
    for (i in 0 until len) if (str[i] == ')') cnt_close++
    for (i in 0 until len) if (cnt_close == i) return i
    // If no opening brackets
    return len
}

fun main() {
    val str = "(()))(()()())))"
    println(findIndex(str))
}