fun main() {
    val strs: Array<String> = arrayOf("geeksforgeeks", "geeks", "gek", "geezer")
    println(longest_common_prefix_using_sorting(strs))
}

fun longest_common_prefix_using_sorting(arr: Array<String>): String {
    if(arr.isEmpty())
        return ""
    if(arr.size == 1)
        return arr[0]

    // sort the array to find small and large words
    val sorted = arr.toList().sorted()
    val size = arr.size

    // find the min length word
    val min = Math.min(sorted[0].length, sorted[size - 1].length)
    var i = 0
    while(i<min && sorted[0][i] == sorted[size - 1][i])
        i++

    return sorted[0].substring(0, i)
}