import kotlinx.coroutines.*

// Hands-on 3: Structured Concurrency & Cancellation
// Solusi: semua download adalah child dari satu Job induk.

class DownloadManager(private val scope: CoroutineScope) {

    fun downloadFile(name: String, durationMs: Long): Job {
        val job = scope.launch {
            delay(durationMs)
            println("$name selesai di-download")
        }
        return job
    }
}

fun main() = runBlocking {
    val parentJob = Job()
    val scope = CoroutineScope(parentJob)

    val manager = DownloadManager(scope)

    manager.downloadFile("foto.jpg", 1000)
    manager.downloadFile("video.mp4", 3000)
    manager.downloadFile("dokumen.pdf", 1500)

    delay(1200)

    println("Membatalkan sisa download...")
    parentJob.cancel()

    delay(2000)
    println("Selesai.")
}
