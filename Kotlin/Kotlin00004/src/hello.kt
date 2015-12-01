data class Customer(val name: String, val email: String)

fun main(args: Array<String>) {
    val customer = Customer("John Smith", "john.smith@somewhere.com")
    println(customer)
    println("Hello Kotlin")
}
