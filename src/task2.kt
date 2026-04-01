fun main() {
    val pizza = Dish(1, "Маргарита", listOf("тесто", "томаты", "моцарелла", "базилик"), 490.0)
    pizza.displayInfo()
}


class Dish(
    val id: Int,
    val name: String,
    val ingredients: List<String>,
    val price: Double
) {
    fun displayInfo() {
        println("$id. $name – %.2f руб.".format(price))
        println("   Ингредиенты: ${ingredients.joinToString()}")
    }
}