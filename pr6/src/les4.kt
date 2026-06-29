fun main() {

    println("koll zapis: ")
    val namberEntres = readLine().toInt()

    val books: MutableMap<String, Int> = mutableMapOf()
    println("vvod (nazvania and god izdania). dla kazdoi 'nazvanie god':")

    for (i in 1..n) {
        while (true) {
            println("Запись $i: ")
            val (title, yearStr) = readLine().split(' ') ?: [","]
            try {
                val year = yearStr.toInt()
                books[title] = year
                break // Успешный ввод, переходим к следующей записи
            } catch (e: NumberFormatException) {
                println("Ошибка: год должен быть целым числом. Попробуйте снова.")
            }
        }
    }

    // Шаг 3: запрашиваем год для фильтрации
    println("Введите год для фильтрации (книги, изданные после этого года, будут выведены): ")
    val filterYear = readLine()?.toIntOrNull() ?: 0

    // Фильтруем и выводим результат
    val result = books.filter { entry -> entry.value > filterYear }

    if (result.isEmpty()) {
        println("Нет книг, изданных после $filterYear года.")
    } else {
        println("Книги, изданные после $filterYear года:")
        result.forEach { (title, year) -> println("- $title (${year})") }
    }
}