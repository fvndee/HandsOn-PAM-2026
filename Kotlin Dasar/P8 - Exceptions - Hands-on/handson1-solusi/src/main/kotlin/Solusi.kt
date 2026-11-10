// Hands-on 1: Try-Catch-Finally Dasar
// Solusi: try-catch-finally sebagai expression.

fun safeDivide(a: Int, b: Int): Int {
    return try {
        a / b
    } catch (e: ArithmeticException) {
        println("Error: tidak bisa membagi $a dengan nol")
        0
    } finally {
        println("safeDivide($a, $b) selesai diproses")
    }
}

fun main() {
    println("Hasil 1: ${safeDivide(10, 2)}")
    println("Hasil 2: ${safeDivide(10, 0)}")
    println("Hasil 3: ${safeDivide(9, 3)}")
}
