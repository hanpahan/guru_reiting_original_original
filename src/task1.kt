fun readDishName(): String {
    println("Введите название блюда:")
    return readln()
}

fun readDishPrice(): Double {
    while (true) {
        println("Введите цену блюда:")
        val input = readln()
        try {
            return input.toDouble()
        } catch (e: NumberFormatException) {
            println("Ошибка: введите число (например, 450.0)")
        }
    }
}