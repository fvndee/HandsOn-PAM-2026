import kotlinx.coroutines.*

// Hands-on 2: launch vs async
// Solusi: launch untuk log, async untuk total harga.

suspend fun writeAccessLog(message: String) {
    delay(500)
    println("[LOG] $message")
}

suspend fun calculateTotalPrice(prices: List<Int>): Int {
    delay(700)
    return prices.sum()
}

fun main() = runBlocking {
    val prices = listOf(15000, 25000, 10000)

    launch {
        writeAccessLog("Checkout dimulai")
    }

    val total = async {
        calculateTotalPrice(prices)
    }

    println("Total belanja: Rp${total.await()}")
}
