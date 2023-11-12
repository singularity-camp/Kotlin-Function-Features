package generics

fun main() {
    val generics: Generics<Int> = Generics(2)

    val genericAnimal: Generics<Animal> = Generics(Animal("Tuzik"))

    val myCustomClass = MyCustomClass()
    ensureTrailingPeriod(myCustomClass)
    ensureTrailingPeriod(Animal())
}

fun <T> someFun(param: T) {
    println(param)
}

fun <T> createListOf(item: T): List<T> {
    return listOf(item)
}

val intList = createListOf(1) // Возвращает List<Int>
val stringList = createListOf("Hello") // Возвращает List<String>

data class Animal(val name: String) : Comparable<Animal> {
    override fun compareTo(other: Animal): Int {
        return 0
    }

}

class Generics<C>(c: C) where C : Comparable<C> {
    public var storedObject: C = c

    fun compareTo(otherObject: C) {
        storedObject.compareTo(otherObject)
    }
}

class MyCustomClass : CharSequence, java.lang.Appendable {
    override val length: Int
        get() = TODO("Not yet implemented")

    override fun get(index: Int): Char {
        TODO("Not yet implemented")
    }

    override fun subSequence(startIndex: Int, endIndex: Int): CharSequence {
        TODO("Not yet implemented")
    }

    override fun append(csq: CharSequence?): java.lang.Appendable {
        TODO("Not yet implemented")
    }

    override fun append(csq: CharSequence?, start: Int, end: Int): java.lang.Appendable {
        TODO("Not yet implemented")
    }

    override fun append(c: Char): java.lang.Appendable {
        TODO("Not yet implemented")
    }

}

fun <T> ensureTrailingPeriod(seq: T)
        where T : CharSequence, T : Appendable {
    if (!seq.endsWith('.')) {
        seq.append('.')
    }
}
