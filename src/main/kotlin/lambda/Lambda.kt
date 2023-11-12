package lambda

val lambdaCheck = {}

// val/var name: () -> Unit = {}

fun main() {
    val helloFunc = getHelloFunction()
    helloFunc()
}

val getHelloFunction: () -> (() -> Unit) = {
    hello
}

fun minus(x: Int, y: Int): Int {
    return x - y
}

fun doOperation(x: Int, y: Int, op: (Int, Int) -> Int) {
    val result = op(x, y)
    println(result)
}


val hello: () -> Unit = {
    println("Hello, Guys!")
}

val exampleLambda: (String, String) -> Unit = { x, y ->
    println("First string len = ${x.length}")
    println("Second string len = ${y.length}")
}

val exampleLambda2: (String, String) -> Unit = { _, y ->
    println("Second string len = ${y.length}")
}

val helloWithName: (String) -> Unit = { name ->
    println("Hello, $name")
}

val lambdaWithReturn: () -> Int = {
    2
}

val sum = { x: Int, y: Int ->
    val z = x + y
    println("Result = $z")
    z
}

//fun exampleFunWithParam(param1: String, param2: String) {
//
//}

fun exampleFunWithParam(): Int {
    return 0
}

fun example() {

}

class Test(init: () -> Unit) {
    init {
        init()
    }
}

