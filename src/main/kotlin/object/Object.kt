package `object`

fun main() {

    onEvent(myInterface)
    MyClass.create()
}

val myInterface = object : MyInterface {
    override fun one() {

    }

    override fun two() {

    }
}

fun onEvent(myInterface: MyInterface) {
    myInterface.one()
}

interface MyInterface {
    fun one()
    fun two()
}

class MyInterfaceImplementationClass : MyInterface {
    override fun one() {
        TODO("Not yet implemented")
    }

    override fun two() {
        TODO("Not yet implemented")
    }
}

val listener = object : MouseAdapter() {
    override fun mouseClicked(e: MouseEvent) { /*...*/ }
    override fun mouseEntered(e: MouseEvent) { /*...*/ }
}

object DataManager {
    fun registerDataProvider(provider: DataProvider) { /*...*/ }
    val allDataProviders: Collection<DataProvider> get() = /*...*/
}

class MyClass {
    companion object Factory {
        fun create(): MyClass = MyClass()
    }
}