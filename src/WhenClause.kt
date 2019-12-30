private val name: String = "Nate"
private var greeting: String? = null

fun main() {
    when(greeting) {
        null -> println("Hi")
        else -> println(greeting)
    }
    println(name)
}