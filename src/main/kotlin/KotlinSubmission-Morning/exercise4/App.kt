package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     */

    // Buat di bawah sini

    try {
        // Simulasikan suatu operasi yang mungkin menimbulkan exception
        val result = divideNumbers(10, 0)
        println("Result: $result")
    } catch (e: ArithmeticException) {
        // Tangani exception jika terjadi pembagian oleh 0
        println("Error: ${e.message}")
    } catch (e: Exception) {
        // Tangani exception umum jika terjadi exception lainnya
        println("Unexpected error: ${e.message}")
    }
}

// Fungsi untuk pembagian dua angka
fun divideNumbers(a: Int, b: Int): Int {
    // Coba lakukan pembagian
    return a / b
}

