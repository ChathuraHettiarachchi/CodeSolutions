/**
 * Giving a dictionary and a string ‘str’, find the longest string in dictionary which can be formed by deleting some characters of the given ‘str’.
 * Examples:
 *
 * Input : dict = {"ale", "apple", "monkey", "plea"}
 *         str = "abpcplea"
 * Output : apple
 *
 * Input  : dict = {"pintu", "geeksfor", "geeksgeeks", " forgeek"}
 *          str = "geeksforgeeks"
 * Output : geeksgeeks
 */

fun findLargestWord(dict: List<String>, str: String): String {
    var output: MutableList<String> = mutableListOf()
    val chars = str.toCharArray()
    dict.forEach {
        val wordChars = it.toCharArray()
        var counter = wordChars.size
        wordChars.forEach { c->
            if(chars.contains(c))
                counter--
        }
        if(counter == 0){
            output.add(it)
        }
    }

    output.sortBy { it.length}
    return output.last()
}

fun main(){
    val arr = listOf("ale", "apple", "monkey", "plea")
    val str = "abpcplea"
    println(findLargestWord(arr, str));
}