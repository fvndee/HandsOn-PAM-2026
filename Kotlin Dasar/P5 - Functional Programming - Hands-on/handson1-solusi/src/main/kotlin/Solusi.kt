// Hands-on 1: Higher-Order Function
// Solusi: calculate menerima fungsi sebagai parameter.

fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    val tambah = calculate(10, 4) { x, y -> x + y }
    println("Tambah: $tambah")

    val kurang = calculate(10, 4) { x, y -> x - y }
    println("Kurang: $kurang")

    val kali = calculate(10, 4) { x, y -> x * y }
    println("Kali: $kali")
}
