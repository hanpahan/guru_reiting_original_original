//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val menu = listOf(
        Dish(1, "Цезарь", listOf("курица", "салат", "соус", "пармезан"), 450.0),
        Dish(2, "Стейк", listOf("говядина", "розмарин", "оливковое масло"), 890.0),
        Dish(3, "Тирамису", listOf("печенье", "маскарпоне", "кофе", "какао"), 320.0)
    )

    showMenu(menu)

    println("\n--- Добавим новое блюдо ---")
    val newName = readDishName()
    val newPrice = readDishPrice()
    println("Добавлено: $newName за $newPrice руб.")
}