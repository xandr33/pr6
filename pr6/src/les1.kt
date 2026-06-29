fun main() {
    val nambers = readln().toString()

    val result = buildString {
        for (i in nambers.indices){
            if (i % 2 == 0){
                append(nambers[i])
            }
        }
    }
    println("chetniesimvol: $result")
}