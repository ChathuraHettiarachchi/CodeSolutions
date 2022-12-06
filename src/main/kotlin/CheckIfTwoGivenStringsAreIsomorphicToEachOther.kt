
import java.util.*


/**
 * Two strings str1 and str2 are called isomorphic if there is a one-to-one mapping possible for every character of str1 to every character of str2. And all occurrences of every character in ‘str1’ map to the same character in ‘str2’.
 *
 * Examples:
 *
 * Input:  str1 = “aab”, str2 = “xxy”
 * Output: True
 * Explanation: ‘a’ is mapped to ‘x’ and ‘b’ is mapped to ‘y’.
 *
 * Input:  str1 = “aab”, str2 = “xyz”
 * Output: False
 * Explanation: One occurrence of ‘a’ in str1 has ‘x’ in str2 and other occurrence of ‘a’ has ‘y’.
 */

fun areIsomorphic(str1: String, str2: String): String? {
    val m = str1.length
    val n = str2.length

    // Length of both strings must be same for one to one correspondence
    if (m != n) return "False"

    // To mark visited characters in str2
    val marked = arrayOfNulls<Boolean>(256)
    Arrays.fill(marked, false)

    // To store mapping of every character from str1 to that of str2. Initialize all entries of map as -1.
    val map = IntArray(256)
    Arrays.fill(map, -1)

    // Process all characters one by on
    for (i in 0 until n) {
        // If current character of str1 is seen first time in it.
        if (map[str1[i].code] == -1) {
            // If current character of str2 is already seen, one to one mapping not possible
            if (marked[str2[i].code] == true) return "False"

            // Mark current character of str2 as visited
            marked[str2[i].code] = true

            // Store mapping of current characters
            map[str1[i].code] = str2[i].code
        } else if (map[str1[i].code] != str2[i].code) return "False"
    }
    return "True"
}

fun main() {
    val res = areIsomorphic("aab", "xxy")
    println(res)
}