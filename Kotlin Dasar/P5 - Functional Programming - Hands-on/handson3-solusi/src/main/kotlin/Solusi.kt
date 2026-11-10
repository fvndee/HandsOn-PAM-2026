// Hands-on 3: Closure ? Counter Factory
// Solusi: lambda menangkap state count di luar scope.

fun makeCounter(): () -> Int {
    var count = 0
    return {
        count += 1
        count
    }
}

fun main() {
    val counterA = makeCounter()
    val counterB = makeCounter()

    println(counterA()) // 1
    println(counterA()) // 2
    println(counterA()) // 3

    println(counterB()) // 1
    println(counterB()) // 2
}
