fun main() {
    println("koll element:")
    val count = readln().toInt()

    val strings = List(count){ readln() }
    val lengts = strings.map{ it.length }

    println("spisok dlin: $lengts")
}