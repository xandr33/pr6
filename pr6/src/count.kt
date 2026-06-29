fun main() {
    val words = listOf("cat", "elefant","dog")
    val longwords = words.count { it.length > 3 }

    println(longwords)

    
}