private val name: String = "Nate"
private var greeting: String? = null

fun main() {
    if(greeting != null) {
        println(greeting)
    } else {
        println("Hi")
    }
    println(name)
}