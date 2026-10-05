// Hands-on 3: Loops, Ranges & Null Safety
// Tugas: Lengkapi ScoreBoard agar bisa menyaring skor yang valid (bukan null)
// dan berada dalam batas kelulusan, lalu tampilkan bilangan ganjil dengan loop.

class ScoreBoard(private val skorMentah: List<Int?>) {
    val skorValid: List<Int> = skorMentah.filterNotNull()

    fun skorKelulusan(batasLulus: Int): List<Int> {
        return skorValid.filter { it >= batasLulus }.sortedDescending()
    }
}

fun cetakRentangGanjil(sampai: Int) {
    for (i in 1..sampai step 2) {
        print("$i ")
    }
}

fun main() {
    val papan = ScoreBoard(listOf(85, null, 72, 90, null, 55, 100))
    println("Skor lulus (>= 70): ${papan.skorKelulusan(70)}")

    cetakRentangGanjil(10)
}
