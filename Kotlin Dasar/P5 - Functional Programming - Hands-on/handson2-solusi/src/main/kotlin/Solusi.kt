// Hands-on 2: Lambda vs Function Reference
// Solusi: dua pipeline, hasil sama.

fun isEvenLength(s: String): Boolean = s.length % 2 == 0

fun toUpper(s: String): String = s.uppercase()

fun main() {
    val mahasiswa = listOf("Andi", "Budi", "Citra", "Dewi", "Eka", "Fajar")

    val hasilLambda: List<String> = mahasiswa
        .filter { it.length % 2 == 0 }
        .map { it.uppercase() }

    val hasilReference: List<String> = mahasiswa
        .filter(::isEvenLength)
        .map(::toUpper)

    println("Lambda   : $hasilLambda")
    println("Reference: $hasilReference")
    println("Sama? ${hasilLambda == hasilReference}")
}
