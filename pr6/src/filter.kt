fun main() {
    val nambers = listOf(3,2,4,56,3)

    val evelNamber = nambers.filter { it % 2 == 0 }
    val doblNambers = nambers.map { it * 2 }

    println(evelNamber)
    println(doblNambers)
}