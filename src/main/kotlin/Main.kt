import gradle.model.Product
import gradle.util.StringUtil

class App {
    val greeting: String
        get() {
            return "Hello World."
        }
}

fun main(args: Array<String>) {
    println("Hello World!")

    println("Program arguments: ${args.joinToString()}")

    val product = Product("1", "Samsung")
    println(StringUtil.toUpper(product.name))
}