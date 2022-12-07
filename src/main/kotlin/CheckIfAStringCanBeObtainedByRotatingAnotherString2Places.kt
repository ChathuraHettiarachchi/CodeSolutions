/**
 * Given two strings, the task is to find if a string can be obtained by rotating another string two places.
 *
 * Examples:
 *
 * Input: string1 = “amazon”, string2 = “azonam”
 * Output: Yes
 * Explanation: Rotating string1 by 2 places in anti-clockwise gives the string2.
 *
 * Input: string1 = “amazon”, string2 = “onamaz”
 * Output: Yes
 * Explanation: Rotating string1 by 2 places in clockwise gives the string2.
 */

fun isRotated(str1: String, str2: String): Boolean {
    if(str1.length != str2.length || str1.length <= 2) return false
    val clockwise = str1.substring(2)+str1.substring(0, 2)
    val antiClockwise = str1.substring(str1.length - 2) + str1.substring(0, str1.length - 2)

    //clockwise
    return (str2 == clockwise || str2 == antiClockwise)
}

fun main() {
    val str1 = "gee"
    val str2 = "ege"
    println(if (isRotated(str1, str2)) "Yes" else "No")
}