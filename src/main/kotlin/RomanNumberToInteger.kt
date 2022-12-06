/**
 * Given a Roman numeral, the task is to find its corresponding decimal value.
 *
 * Example :
 *
 * Input: IX
 * Output: 9
 * IX is a Roman symbol which represents 9
 *
 * Input: XL
 * Output: 40
 * XL is a Roman symbol which represents 40
 *
 * Input: MCMIV
 * Output: 1904
 * M is a thousand,
 * CM is nine hundred and
 * IV is four
 */
fun value(r: Char): Int {
    if (r == 'I') return 1
    if (r == 'V') return 5
    if (r == 'X') return 10
    if (r == 'L') return 50
    if (r == 'C') return 100
    if (r == 'D') return 500
    return if (r == 'M') 1000 else -1
}

fun romanToDecimal(str: String): Int {
    // Initialize result
    var res = 0
    var i = 0
    while (i < str.length) {

        // Getting value of symbol s[i]
        val s1 = value(str[i])

        // Getting value of symbol s[i+1]
        if (i + 1 < str.length) {
            val s2 = value(str[i + 1])

            // Comparing both values
            if (s1 >= s2) {
                // Value of current symbol
                // is greater or equalto
                // the next symbol
                res = res + s1
            } else {
                // Value of current symbol is
                // less than the next symbol
                res = res + s2 - s1
                i++
            }
        } else {
            res = res + s1
        }
        i++
    }
    return res
}

fun main() {
    val str = "MCMIV"
    println(
        "Integer form of Roman Numeral"
                + " is "
                + romanToDecimal(str)
    )
}

