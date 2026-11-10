// Hands-on 1: Variabel, Fungsi & String Template
// Tugas: Lengkapi fungsi describeProfile() agar mencetak deskripsi profil
// menggunakan string template, default parameter, dan penanganan nilai
// nullable dengan safe call (?.) dan elvis operator (?:).

fun describeProfile(nama: String, umur: Int?, kota: String = "Tidak diketahui"): String {
    val umurText = umur?.toString() ?: "umur tidak diketahui"
    return "Nama: $nama, Umur: $umurText, Kota: $kota"
}

fun main() {
    println(describeProfile("Andi", 20, "Bandar Lampung"))
    println(describeProfile("Budi", null))
    println(describeProfile(nama = "Citra", umur = 19))
}
