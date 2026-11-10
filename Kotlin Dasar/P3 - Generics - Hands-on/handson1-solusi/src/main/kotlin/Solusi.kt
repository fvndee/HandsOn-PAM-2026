// Hands-on 1: Generic Class ? Box<T>
// Solusi: Box<T> dengan fungsi map<R>.

class Box<T>(val value: T) {
    fun <R> map(transform: (T) -> R): Box<R> = Box(transform(value))
}

fun main() {
    val intBox = Box(23)
    println("intBox.value = ${intBox.value}")

    val cupBox = Box("cup")
    println("cupBox.value = ${cupBox.value}")

    val stringBox = intBox.map { "Angka: $it" }
    println("stringBox.value = ${stringBox.value}")

    val lengthBox = cupBox.map { it.length }
    println("lengthBox.value = ${lengthBox.value}")
}
