fun main() {
    val s = "Banana".lowercase()
    val chars = s.toCharArray().toList()

    var output = ""
    var i = 0
    while (i < chars.size){
        var j = 1
        while((i+j)<chars.size - 1 && chars[i+j] == chars[i]){
            j++
        }
        output += "$j${chars[i]}"
        i++
    }

    println(output)
}