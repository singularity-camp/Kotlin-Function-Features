package extensions

// fun ObjType.funName(param: ParamType): ReturnType

fun main() {
    val testString = "    abddertg   "
    println(testString)
    val trimmedString = testString.trim()
    println(trimmedString)
}

fun Int.square(): Int {
    return this * this
}

fun String.letterCount(c: Char) : Int {
    var count = 0
    for(n in this){
        if(n == c) count++
    }
    return count
}

fun String.printLen() {
    println(length)
}