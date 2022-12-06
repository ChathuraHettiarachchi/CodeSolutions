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