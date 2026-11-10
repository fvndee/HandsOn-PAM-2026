// Hands-on 2: Interface & Data Class
// Solusi: interface Payable + data class Employee.

interface Payable {
    fun calculateSalary(): Double
}

data class Employee(
    val name: String,
    val baseSalary: Double,
    val bonus: Double
) : Payable {
    override fun calculateSalary(): Double = baseSalary + bonus
}

fun main() {
    val alice = Employee("Alice", baseSalary = 5_000_000.0, bonus = 500_000.0)

    val bob = alice.copy(name = "Bob")

    println("Gaji ${alice.name}: ${alice.calculateSalary()}")
    println("Gaji ${bob.name}: ${bob.calculateSalary()}")

    val aliceDuplicate = alice.copy()
    println("alice == aliceDuplicate? ${alice == aliceDuplicate}")

    println(alice)
}
