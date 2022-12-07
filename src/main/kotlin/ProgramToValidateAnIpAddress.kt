import java.lang.Exception
import java.util.*

/**
 * Write a program to Validate an IPv4 Address.
 * According to Wikipedia, IPv4 addresses are canonically represented in dot-decimal notation, which consists of four
 * decimal numbers, each ranging from 0 to 255, separated by dots, e.g., 172.16.254.1
 */

fun validate(s: String): Boolean {
    if(s.length < 7)
        return false

    val parts = s.split(".")
    val fourPartCheck = BooleanArray(4)
    Arrays.fill(fourPartCheck, false)

    if(parts.size < 4)
        return false

    var res = false
    parts.forEachIndexed { i, it ->
        // assuming 0-255 range
        try {
            if(it.toInt() in 0..255){
                fourPartCheck[i] = true
            } else{
                res = false
                return@forEachIndexed
            }
        } catch (e: Exception){
            res = false
            return@forEachIndexed
        }
    }

    return fourPartCheck.all { it }
}

fun main(){
    println(validate("128.0.0.1"))
    println(validate("125.16.100.1"))
    println(validate("25.512.100.1"))
    println(validate("125.512.100.abc"))
}