fun main() {
    println("koll element:")
    val n = readln().toInt()

    val array1 = IntArray(n)
    val array2 = IntArray(n)

    println("mass 1:")
    for (i in 0..n){
        println("Element $i")
        val value = readln().toInt()
        array1[i] = value
    }


    println("mass 2:")
    for (i in 0..n){
        println("Element $i")
        val value = readln().toInt()
        array2[i] = value
    }
    val sumArray = IntArray(n){ array1[it] + array2[it] }
    println("mass sum: ${sumArray.joinToString()}")

}