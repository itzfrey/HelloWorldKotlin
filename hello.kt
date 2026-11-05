import java.time.LocalDate
import java.time.format.DateTimeFormatter

/**
 * Prints a Hello World greeting with the given name and today's date.
 */
fun greet(name: String) {
    // Format today's date, for example "Thursday, November 05, 2026"
    val today = LocalDate.now().format(DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy"))
    println("Hello World!")
    println("My name is $name, and I am learning to build software.")
    println("Today is $today.")
}

// The program starts running here
fun main() {
    // Change this to the name you want shown
    greet("Godfrey")
}